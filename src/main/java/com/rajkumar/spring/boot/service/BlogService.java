package com.rajkumar.spring.boot.service;

import com.rajkumar.spring.boot.DTO.BlogDto;

/**
 * @author Rajkumar
 */
public interface BlogService {

    /**
     * Creates the new blog
     *
     * @param blogDto
     * @return
     */
    BlogDto createBlog(BlogDto blogDto);

    /**
     * This method <code>findById()</code> find the blog based on the passed blog id
     *
     * @param id
     * @return <code>BlogDto object</code>
     */
    BlogDto findById(Long id);

    /**
     * This method <code>findByTitle()</code> finds the blog based on the blog title
     *
     * @param title
     * @return
     */
    BlogDto findByTitle(String title);

}
