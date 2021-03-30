package com.example.demo.mappers;

import com.example.demo.DTO.UserDTO;
import com.example.demo.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toDTO (UserEntity userEntity);
    UserEntity toEntity (UserDTO userDTO);
}
