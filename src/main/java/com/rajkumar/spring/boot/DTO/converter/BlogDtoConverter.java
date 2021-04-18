package com.rajkumar.spring.boot.DTO.converter;

import com.rajkumar.spring.boot.DTO.BlogDto;
import com.rajkumar.spring.boot.domain.Author;
import com.rajkumar.spring.boot.domain.Blog;
import org.springframework.stereotype.Component;

@Component
public class BlogDtoConverter implements DTOConverter<BlogDto, Blog> {

    @Override
    public Blog convertToDomain(BlogDto dto) {
        Blog blog = new Blog();
        blog.setId(dto.getId());
        blog.setTitle(dto.getTitle());
        Author author = new Author();
        //author.setId(dto.getAuthor());
       // blog.setAuthor(dto.getAuthor());
        return null;
    }

    @Override
    public BlogDto convertToDto(Blog domain) {
        return null;
    }

}
