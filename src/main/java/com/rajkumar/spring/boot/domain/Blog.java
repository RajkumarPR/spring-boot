package com.rajkumar.spring.boot.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    public Blog() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Set<Comments> getComments() {
        return comments;
    }

    public void setComments(Set<Comments> comments) {
        this.comments = comments;
    }

    public Set<BlogImage> getBlogImages() {
        return blogImages;
    }

    public void setBlogImages(Set<BlogImage> blogImages) {
        this.blogImages = blogImages;
    }
}
