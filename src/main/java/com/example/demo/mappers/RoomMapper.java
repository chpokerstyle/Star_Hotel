package com.example.demo.mappers;

import com.example.demo.DTO.RoomDTO;
import com.example.demo.model.RoomEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper {
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);

    RoomDTO toDTO(RoomEntity roomEntity);
    RoomEntity toEntity(RoomDTO roomDTO);
}
