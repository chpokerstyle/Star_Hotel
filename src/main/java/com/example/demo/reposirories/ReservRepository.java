package com.example.demo.reposirories;

import com.example.demo.model.ReservModel;
import org.springframework.data.repository.CrudRepository;

public interface ReservRepository extends CrudRepository<ReservModel, Long> {
}
