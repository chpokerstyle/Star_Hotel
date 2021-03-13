package com.example.demo.reposirories;

import com.example.demo.model.RoomEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.List;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
    
    RoomEntity findByRoomNumber(int number);
    RoomEntity findByRoomPersons(int persons);

}
