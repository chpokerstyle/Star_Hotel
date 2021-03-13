package com.example.demo.service;

import com.example.demo.DTO.converter.RoomConverter;
import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.RoomRepository;
import org.junit.jupiter.api.Test;

class RoomDefaultServiceTest {
    final RoomRepository roomRepository;
    final RoomConverter converter;

    RoomDefaultServiceTest(RoomRepository roomRepository, RoomConverter converter) {
        this.roomRepository = roomRepository;
        this.converter = converter;
    }

    @Test
    RoomDTO createRoom() {
        return null;
    }

    @Test
    void deleteRoom() {
    }

    @Test
    void editRoom() {
    }

    @Test
    void roomAll() {
    }

    @Test
    void numbers() {
    }

    @Test
    void persons() {
    }
}