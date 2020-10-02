package com.rajkumar.spring.boot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Contact not found")
public class ResourceNotFoundException extends RuntimeException {
}
