package com.rajkumar.spring.boot.DTO.converter;

public interface DTOConverter<D, E> {

    E convertToDomain(D dto);
    D convertToDto(E domain);
}
