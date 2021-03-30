package com.example.demo.mappers;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.model.RoleEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoleMapper {

    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleDTO toDTO(RoleEntity roleEntity);
    RoleEntity toEntity(RoleDTO roleDTO);
}
