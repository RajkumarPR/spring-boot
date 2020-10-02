package com.rajkumar.spring.boot.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "blog_image")
public class BlogImage implements Serializable {
    private static final long serialVersionUID = 213266742595744536L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "id_blog")
    private Blog blog;

    public BlogImage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
