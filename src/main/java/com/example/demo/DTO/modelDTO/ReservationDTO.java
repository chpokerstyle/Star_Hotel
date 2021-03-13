package com.example.demo.DTO.modelDTO;

import com.example.demo.model.RoomEntity;
import com.example.demo.model.UserEntity;
import lombok.Data;

import java.util.Date;

@Data
public class ReservationDTO {
    Long id;
    Date checkFrom;
    Date checkTo;
    int persons;
    RoomEntity roomEntity;
    UserEntity userEntity;
}
