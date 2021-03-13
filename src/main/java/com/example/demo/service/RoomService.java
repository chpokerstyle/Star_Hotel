package com.example.demo.service;

import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;

import java.util.List;

public interface RoomService {
    RoomDTO createRoom(RoomDTO roomDTO);
    void deleteRoom(Long id);
    RoomDTO editRoom(RoomDTO roomDTO);
    Iterable<RoomEntity>roomAll();

    List<RoomEntity> numbers(int number);

    List<RoomEntity> persons(int persons);

}