package com.example.demo.service;

import com.example.demo.DTO.RoomDTO;
import com.example.demo.mappers.RoomMapper;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.RoomRepository;
import com.example.demo.service.interfaces.RoomService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RoomServiceImpl implements RoomService {

    final RoomRepository roomRepository;

    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public RoomDTO create(RoomDTO roomDTO) {
        RoomEntity save = roomRepository.save(RoomMapper.INSTANCE.toEntity(roomDTO));
        return RoomMapper.INSTANCE.toDTO(save);
    }

    @Override
    public void delete(Long id) {
    roomRepository.deleteById(id);
    }

    @Override
    public RoomDTO edit(RoomDTO roomDTO) {
        RoomEntity save = roomRepository.save(RoomMapper.INSTANCE.toEntity(roomDTO));
        return RoomMapper.INSTANCE.toDTO(save);
    }

    @Override
    public List<RoomDTO> getAll() {
        return roomRepository.findAll()
                .stream()
                .map(RoomMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }


    @Override
    public RoomDTO findByNumber(int number) {
        RoomEntity entity = roomRepository.findByNumber(number);
        return RoomMapper.INSTANCE.toDTO(entity);
    }


    @Override
    public List<RoomDTO> findAllSortingByPersons(int persons) {

        return roomRepository.findAllByPersonsGreaterThanEqual(persons)
                .stream()
                .map(RoomMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
}
