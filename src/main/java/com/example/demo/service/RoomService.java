package com.example.demo.service;

import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;


public interface RoomService {
    RoomDTO createRoom(RoomDTO roomDTO);
    void deleteRoom(Long id);
    RoomDTO editRoom(RoomDTO roomDTO);
    Iterable<RoomEntity>roomAll();

    RoomEntity numbers(int number);
    Iterable<RoomEntity> persons(int persons);

}
