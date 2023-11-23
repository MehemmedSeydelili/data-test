package com.example.datatest.service;

import com.example.datatest.data.dto.TypeDto;

import java.util.List;

public interface TypeService {

    TypeDto create(TypeDto dto);
    List<TypeDto> allTypes();
    TypeDto getById(Long id);

}
