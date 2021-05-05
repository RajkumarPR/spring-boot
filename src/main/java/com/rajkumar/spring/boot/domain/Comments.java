package com.rajkumar.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comments")
public class Comments implements Serializable {
    private static final long serialVersionUID = -4529765707548836162L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment", columnDefinition = "TEXT")
    @NotNull(message = "Comment cannot be null")
    private String comment;

    @ManyToOne
    @JoinColumn(name = "id_blog")
    private Blog blog;
}
