package com.example.datatest.mapper;

import com.example.datatest.data.dto.TypeDto;
import com.example.datatest.data.type.Type;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TypeMapper {

    TypeMapper INSTANCE = Mappers.getMapper(TypeMapper.class);

    Type mapDtoToEntity(TypeDto dto);
    TypeDto mapEntityToDto(Type type);

}
