package com.example.demo.reposirories;

import com.example.demo.model.RoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoomRepository extends JpaRepository<RoomEntity, Long> {

    List<RoomEntity> findAllByPersonsGreaterThanEqual(int persons);
        RoomEntity findByNumber(int number);
}