package com.rajkumar.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "topic")
public class Topic implements Serializable {
    private static final long serialVersionUID = -5032632860367043710L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    @NotNull(message = "Topic name cannot be null")
    private String name;

    @OneToMany(mappedBy = "topic")
    private Set<Blog> blogs = new HashSet<>();
}
