package com.example.demo.reposirories;

import com.example.demo.model.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Date;


public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {
    ReservationEntity findByCheckFrom(Date checkFrom);
    ReservationEntity findByCheckTo(Date checkTo);
}
