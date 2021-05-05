package com.rajkumar.spring.boot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "blog")
public class Blog implements Serializable {

    private static final long serialVersionUID = 6737160159930871696L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    @NotNull(message = "Blog title can not be null")
    @Size(min = 10, max = 255, message = "Blog title between min 10 and maximum 255")
    private String title;

    @Column(name = "body", columnDefinition = "text")
    @NotNull(message = "Blog body content cannot be null")
    @Type(type = "text")
    private String body;

    @ManyToOne
    @JoinColumn(name = "id_topic")
    private Topic topic;

    @ManyToOne
    @JoinColumn(name = "id_author")
    private Author author;

    @OneToMany(mappedBy = "blog")
    private Set<Comments> comments = new HashSet<>();

    @OneToMany(mappedBy = "blog")
    private Set<BlogImage> blogImages = new HashSet<>();

}
