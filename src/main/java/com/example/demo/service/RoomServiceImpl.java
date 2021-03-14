package com.example.demo.service;

import com.example.demo.DTO.converter.RoomConverter;
import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class RoomServiceImpl implements RoomService {

    final RoomRepository roomRepository;
    final RoomConverter converter;

    public RoomServiceImpl(RoomRepository roomRepository, RoomConverter converter) {
        this.roomRepository = roomRepository;
        this.converter = converter;
    }

    @Override
    public RoomDTO createRoom(RoomDTO roomDTO) {
        RoomEntity save = roomRepository.save(converter.toRoomEntity(roomDTO));
        return converter.toRoomDTO(save);
    }

    @Override
    public void deleteRoom(Long id) {
    roomRepository.deleteById(id);
    }

    @Override
    public RoomDTO editRoom(RoomDTO roomDTO) {
        RoomEntity save = roomRepository.save(converter.toRoomEntity(roomDTO));
        return converter.toRoomDTO(save);
    }

    @Override
    public Iterable<RoomEntity> roomAll() {
        return roomRepository.findAll();
    }

    @Override
    public RoomEntity numbers(int number) {
        return roomRepository.findByNumber(number);
    }

    @Override
    public Iterable<RoomEntity> persons(int persons) {
        return roomRepository.findAllByPersonsGreaterThanEqual(persons);
    }
}
