package com.example.demo.service.interfaces;

import com.example.demo.DTO.RoomDTO;

import java.util.List;


public interface RoomService {
    RoomDTO create(RoomDTO roomDTO);
    void delete(Long id);
    RoomDTO edit(RoomDTO roomDTO);
    List<RoomDTO> getAll();
    RoomDTO findByNumber(int numbers);
    List<RoomDTO> findAllSortingByPersons(int persons);
}
