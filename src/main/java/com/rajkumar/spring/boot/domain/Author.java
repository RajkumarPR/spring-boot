package com.rajkumar.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "author")
public class Author implements Serializable {

    private static final long serialVersionUID = -556238137180561306L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    @NotNull(message = "Name cannot be null")
    @Size(min = 3, max = 100, message = "About Me must be between 5 and 100 characters")
    private String name;

    @Column(name = "username", unique = true)
    @NotNull(message = "User name cannot be null")
    @Size(min = 3, max = 100, message = "About Me must be between 5 and 100 characters")
    private String username;

    @Column(name = "email")
    @Email(message = "Email should be valid")
    private String email;

    @OneToMany(mappedBy = "author")
    private Set<Blog> blog = new HashSet<>();
}
