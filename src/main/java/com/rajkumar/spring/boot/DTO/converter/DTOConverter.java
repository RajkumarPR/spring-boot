package com.rajkumar.spring.boot.DTO.converter;

import javafx.beans.binding.ObjectExpression;

public interface DTOConverter<D, E> {

    E convertToDomain(D dto);
    D convertToDto(E domain);
}
