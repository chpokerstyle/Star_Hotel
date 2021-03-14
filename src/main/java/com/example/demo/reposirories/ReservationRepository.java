package com.example.demo.reposirories;

import com.example.demo.model.ReservationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface ReservationRepository extends CrudRepository<ReservationEntity, Long> {
    ReservationEntity findByCheckFrom(Date checkFrom);
    ReservationEntity findByCheckTo(Date checkTo);
}
