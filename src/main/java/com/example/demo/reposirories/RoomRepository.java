package com.example.demo.reposirories;

import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

   List<RoomEntity> findAllByPersonsGreaterThanEqual(int persons);
    RoomEntity findByNumber(int number);
}