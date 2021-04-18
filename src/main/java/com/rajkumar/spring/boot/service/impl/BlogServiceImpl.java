package com.rajkumar.spring.boot.service.impl;

import com.rajkumar.spring.boot.DTO.BlogDto;
import com.rajkumar.spring.boot.repository.BlogRepository;
import com.rajkumar.spring.boot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogRepository blogRepository;

    @Override
    public BlogDto createBlog(BlogDto blogDto) {
        return null;
    }

    @Override
    public BlogDto findById(Long id) {
        return null;
    }

    @Override
    public BlogDto findByTitle(String title) {
        return null;
    }
}
