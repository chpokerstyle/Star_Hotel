package com.example.demo.mappers;

import com.example.demo.DTO.FacilitiesDTO;
import com.example.demo.model.FacilitiesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface FacilitiesMapper {

    FacilitiesMapper INSTANCE = Mappers.getMapper(FacilitiesMapper.class);

    FacilitiesDTO toDTO(FacilitiesEntity facilitiesEntity);
    FacilitiesEntity toEntity(FacilitiesDTO facilitiesDTO);
}
