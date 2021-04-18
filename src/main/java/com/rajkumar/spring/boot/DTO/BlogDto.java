package com.rajkumar.spring.boot.DTO;

import com.rajkumar.spring.boot.domain.BlogImage;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class BlogDto implements Serializable {

    private static final long serialVersionUID = 8199646535732689035L;

    private Long id;

    @Column(name = "title")
    @NotNull(message = "Blog title can not be null")
    @Size(min = 10, max = 255, message = "Blog title between min 10 and maximum 255")
    private String title;

    @Column(name = "body", columnDefinition = "text")
    @NotNull(message = "Blog body content cannot be null")
    @Type(type = "text")
    private String body;

    private TopicDto topic;

    private AuthorDto author;

    private Set<CommentDto> comments = new HashSet<>();

    private Set<BlogImageDto> blogImages = new HashSet<>();


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

    public TopicDto getTopic() {
        return topic;
    }

    public void setTopic(TopicDto topic) {
        this.topic = topic;
    }

    public AuthorDto getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDto author) {
        this.author = author;
    }

    public Set<CommentDto> getComments() {
        return comments;
    }

    public void setComments(Set<CommentDto> comments) {
        this.comments = comments;
    }

    public Set<BlogImageDto> getBlogImages() {
        return blogImages;
    }

    public void setBlogImages(Set<BlogImageDto> blogImages) {
        this.blogImages = blogImages;
    }

    @Override
    public String toString() {
        return "BlogDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", topic=" + topic +
                ", author=" + author +
                ", comments=" + comments +
                ", blogImages=" + blogImages +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlogDto)) return false;
        BlogDto blogDto = (BlogDto) o;
        return Objects.equals(id, blogDto.id) &&
                Objects.equals(title, blogDto.title) &&
                Objects.equals(body, blogDto.body) &&
                Objects.equals(topic, blogDto.topic) &&
                Objects.equals(author, blogDto.author) &&
                Objects.equals(comments, blogDto.comments) &&
                Objects.equals(blogImages, blogDto.blogImages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, body, topic, author, comments, blogImages);
    }
}
