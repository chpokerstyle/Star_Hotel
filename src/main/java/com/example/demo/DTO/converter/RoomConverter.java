package com.example.demo.DTO.converter;

import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter {
    public RoomEntity toRoomEntity(RoomDTO roomDTO){
        RoomEntity roomEntity = new RoomEntity();
        roomEntity.setId(roomDTO.getId());
        roomEntity.setNumber(roomDTO.getNumber());
        roomEntity.setPersons(roomDTO.getPersons());
        return roomEntity;
    }
    public RoomDTO toRoomDTO(RoomEntity roomEntity){
        RoomDTO roomDTO = new RoomDTO();
        roomDTO.setId(roomEntity.getId());
        roomDTO.setNumber(roomEntity.getNumber());
        roomDTO.setPersons(roomEntity.getPersons());
        return roomDTO;
    }

}
