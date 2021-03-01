package com.example.demo.reposirories;

import com.example.demo.model.ReservedEntity;
import org.springframework.data.repository.CrudRepository;

public interface ReservRepository extends CrudRepository<ReservedEntity, Long> {
}
