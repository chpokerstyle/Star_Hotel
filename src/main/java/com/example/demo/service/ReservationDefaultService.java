package com.example.demo.service;

import com.example.demo.DTO.converter.ReservationConvert;
import com.example.demo.model.ReservationEntity;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.ReservationRepository;
import com.example.demo.reposirories.RoomRepository;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
@Component
public class ReservationDefaultService implements ReservationService {
    final ReservationRepository reservationRepository;
    final RoomRepository roomRepository;
    final ReservationConvert reservationConvert;

    public ReservationDefaultService( ReservationRepository reservationRepository,
                                      RoomRepository roomRepository,
                                     ReservationConvert reservationConvert) {
        this.reservationRepository = reservationRepository;

        this.roomRepository = roomRepository;
        this.reservationConvert = reservationConvert;
    }


    @Override
    public boolean isExistsReservation(List<ReservationEntity> reservationEntityList, Date dateFrom, Date dateTo) {

    dateFrom = dateTo;

        return false;
    }

    @Override
    public boolean checkAvailabilityForBooking(int roomNumber, Date dateFrom, Date dateTo) {
        return false;
    }

    //  @Override
  //  public boolean checkAvailabilityForBooking(int roomNumber, Date dateFrom, Date dateTo) {
 //       RoomEntity roomEntity = roomRepository.findByRoomNumber(roomNumber);
   //     return !isExistsReservation(roomEntity.reservationEntityList, dateFrom, dateTo);
   // }



}
