package com.example.demo.reposirories;

import com.example.demo.model.RoomEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

   List<RoomEntity> findAllByPersonsGreaterThanEqual(int persons);
    RoomEntity findByNumber(int number);
}