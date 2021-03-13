package com.example.demo.service;

import com.example.demo.DTO.modelDTO.ReservationDTO;
import com.example.demo.model.ReservationEntity;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface ReservationService {
     public boolean isExistsReservation(List<ReservationEntity> reservationEntityList, Date dateFrom, Date dateTo);
    public boolean checkAvailabilityForBooking(int roomNumber, Date dateFrom, Date dateTo);
}
