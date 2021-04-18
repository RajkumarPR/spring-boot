package com.rajkumar.spring.boot.controller;

import com.rajkumar.spring.boot.DTO.BlogDto;
import com.rajkumar.spring.boot.domain.Blog;
import com.rajkumar.spring.boot.repository.BlogRepository;
import com.rajkumar.spring.boot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/Blogs")
public class BlogController {


    @Autowired
    private BlogService blogService;

    @PostMapping
    public ResponseEntity<BlogDto> createBlog(@Valid @RequestBody BlogDto blogDto) {
        if (blogDto != null)
            return  new ResponseEntity<>(blogService.createBlog(blogDto), HttpStatus.CREATED);

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getBlogs() {
        return null;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Blog> getBlog() {
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
