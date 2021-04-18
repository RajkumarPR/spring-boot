package com.rajkumar.spring.boot.service;

import com.rajkumar.spring.boot.DTO.AuthorDto;

public interface AuthorService {

    AuthorDto findById(Long id);
    AuthorDto findByUserName(String userName);

}
