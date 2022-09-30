package com.mapper.example.demo.mapper;

import com.mapper.example.demo.mapper.userDto.UserDTO;
import com.mapper.example.demo.mapper.userEntity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface MappingData {
    MappingData INSTANCE = Mappers.getMapper(MappingData.class);

    UserDTO entityToDto(UserEntity obj);

    UserEntity dtoToEntity(UserDTO obj);

}
