package com.example.demo.service.exceptions;

import com.example.demo.model.ReservationEntity;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.RoomRepository;

import java.util.Date;
import java.util.List;

public class ReservationExceptions extends Exception {
//    final RoomRepository roomRepository;
//
//    public ReservationExceptions(RoomRepository roomRepository) {
//        this.roomRepository = roomRepository;
//    }
//
//    public boolean isExistsReservationA(List<ReservationEntity> reservationEntityList, Date dateFrom, Date dateTo) {
//
//        return reservationEntityList
//                .stream()
//                .anyMatch(it ->
//                dateFrom.before(it.getCheckFrom()) && it.getCheckTo().before(dateTo));
//    }
//
//    public boolean checkAvailabilityForBookingA(int number, Date dateFrom, Date dateTo) {
//        RoomEntity room = roomRepository.findByNumber(number);
//        return !isExistsReservationA(room.reservationEntityList, dateFrom, dateTo);
//    }
}
