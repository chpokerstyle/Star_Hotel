package com.example.demo.service.interfaces;

import com.example.demo.DTO.modelDTO.ReservationDTO;
import com.example.demo.model.ReservationEntity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface ReservationService {
    boolean isExistsReservation(List<ReservationEntity> reservationEntityList, Date dateFrom, Date dateTo);
    boolean checkAvailabilityForBooking(int roomNumber, Date dateFrom, Date dateTo);
    ReservationDTO createReservation(ReservationDTO reservationDTO);
    ReservationDTO editReservation(ReservationDTO reservationDTO);
    void deleteReservation(Long id);
    Iterable<ReservationEntity>reservationAll();
}
