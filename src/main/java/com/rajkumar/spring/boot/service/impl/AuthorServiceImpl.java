package com.rajkumar.spring.boot.service.impl;

import com.rajkumar.spring.boot.DTO.AuthorDto;
import com.rajkumar.spring.boot.service.AuthorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {
    @Override
    public AuthorDto findById(Long id) {
        return null;
    }

    @Override
    public AuthorDto findByUserName(String userName) {
        return null;
    }
}
