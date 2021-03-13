package com.example.demo.DTO.converter;

import com.example.demo.DTO.modelDTO.ReservationDTO;
import com.example.demo.model.ReservationEntity;
import org.springframework.stereotype.Component;

@Component
public class ReservationConvert {

public ReservationEntity toReservationEntity(ReservationDTO reservationDTO){
    ReservationEntity reservationEntity = new ReservationEntity();

    reservationEntity.setId(reservationDTO.getId());
    reservationEntity.setCheckTo(reservationDTO.getCheckTo());
    reservationEntity.setCheckFrom(reservationDTO.getCheckFrom());
    reservationEntity.setPersons(reservationDTO.getPersons());
    reservationEntity.setUserEntity(reservationDTO.getUserEntity());
    reservationEntity.setRoomEntity(reservationDTO.getRoomEntity());
    return reservationEntity;
}

    public ReservationDTO toReservationDTO(ReservationEntity reservationEntity){
        ReservationDTO reservationDTO = new ReservationDTO();

        reservationDTO.setId(reservationEntity.getId());
        reservationDTO.setCheckTo(reservationEntity.getCheckTo());
        reservationDTO.setCheckFrom(reservationEntity.getCheckFrom());
        reservationDTO.setPersons(reservationEntity.getPersons());
        reservationDTO.setRoomEntity(reservationEntity.getRoomEntity());
        reservationDTO.setUserEntity(reservationEntity.getUserEntity());
        return reservationDTO;
    }
}
