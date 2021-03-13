package com.example.demo.service;

import com.example.demo.DTO.converter.RoomConverter;
import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.RoomRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RoomDefaultService implements RoomService {

    final RoomRepository roomRepository;
    final RoomConverter converter;

    public RoomDefaultService(RoomRepository roomRepository, RoomConverter converter) {
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
    public List<RoomEntity> numbers(int number) {
        return (List<RoomEntity>) roomRepository.findByRoomNumber(number);
    }

    @Override
    public List<RoomEntity> persons(int persons) {
        return (List<RoomEntity>) roomRepository.findByRoomPersons(persons);
    }

}
