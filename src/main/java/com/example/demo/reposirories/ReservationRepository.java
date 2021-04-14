package com.example.demo.reposirories;

import com.example.demo.model.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

}
