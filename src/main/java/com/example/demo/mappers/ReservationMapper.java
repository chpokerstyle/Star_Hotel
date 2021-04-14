package com.example.demo.mappers;

import com.example.demo.DTO.ReservationDTO;
import com.example.demo.model.ReservationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReservationMapper {

    ReservationMapper INSTANCE =Mappers.getMapper(ReservationMapper.class);

    ReservationDTO toDTO(ReservationEntity reservationEntity);
    ReservationEntity toEntity(ReservationDTO reservationDTO);
}
