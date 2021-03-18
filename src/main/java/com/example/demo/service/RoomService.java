package com.example.demo.service;

import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;

import java.util.ArrayList;


public interface RoomService {
    RoomDTO createRoom(RoomDTO roomDTO);
    void deleteRoom(Long id);
    RoomDTO editRoom(RoomDTO roomDTO);
    Iterable<RoomEntity>roomAll();
    ArrayList<RoomEntity>roomAllSorting();
    RoomEntity numbers(int number);
    Iterable<RoomEntity> persons(int persons);

}
