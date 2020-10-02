package com.rajkumar.spring.boot.controller;

import com.rajkumar.spring.boot.domain.Blog;
import com.rajkumar.spring.boot.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/Blogs")
public class BlogController {


    private final BlogRepository blogRepository;

    @Autowired
    public BlogController(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @GetMapping
    public ResponseEntity<List<Blog>> getBlogs() {
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Blog> getBlog() {
        return null;
    }

    @PostMapping
    public ResponseEntity<Blog> createBlog() {
        return null;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Blog> updateBlog() {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteBlog() {
        return null;
    }
}
