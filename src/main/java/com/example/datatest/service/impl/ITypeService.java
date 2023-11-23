package com.example.datatest.service.impl;

import com.example.datatest.data.dto.TypeDto;
import com.example.datatest.data.type.Type;
import com.example.datatest.mapper.TypeMapper;
import com.example.datatest.repository.TypeRepository;
import com.example.datatest.service.TypeService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ITypeService implements TypeService {

    private final TypeRepository typeRepository;

    @Override
    public TypeDto create(TypeDto dto) {
        Type type = TypeMapper.INSTANCE.mapDtoToEntity(dto);
        typeRepository.save(type);
        return TypeMapper.INSTANCE.mapEntityToDto(type);
    }

    @Override
    public TypeDto getById(Long id) {
        Type type= fetchTypeIfExist(id);
        return TypeMapper.INSTANCE.mapEntityToDto(type);
    }

    @Override
    public List<TypeDto> allTypes() {
        return null;
    }

    private Type fetchTypeIfExist(Long id){
        return typeRepository.findById(id).orElseThrow(()->
                new RuntimeException("Type not found for this ID"));
    }

}
