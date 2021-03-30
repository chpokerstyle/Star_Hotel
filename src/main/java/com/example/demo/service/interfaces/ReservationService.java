package com.example.demo.service.interfaces;

import com.example.demo.DTO.ReservationDTO;

import java.util.List;

public interface ReservationService {
   // boolean isExistsReservation(List<ReservationEntity> reservationEntityList, Date dateFrom, Date dateTo);
   // boolean checkAvailabilityForBooking(int roomNumber, Date dateFrom, Date dateTo);
    ReservationDTO create(ReservationDTO reservationDTO);
    ReservationDTO edit(ReservationDTO reservationDTO);
    void delete(Long id);
    List<ReservationDTO> getAll();
}
