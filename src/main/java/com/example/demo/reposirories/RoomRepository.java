package com.example.demo.reposirories;

import com.example.demo.model.RoomModel;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomModel, Long> {
}
