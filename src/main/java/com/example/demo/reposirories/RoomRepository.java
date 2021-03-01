package com.example.demo.reposirories;

import com.example.demo.model.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
}
