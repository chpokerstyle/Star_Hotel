package com.example.demo.service;

import com.example.demo.DTO.converter.ReservationConvert;
import com.example.demo.DTO.modelDTO.ReservationDTO;
import com.example.demo.model.ReservationEntity;
import com.example.demo.model.RoomEntity;
import com.example.demo.reposirories.ReservationRepository;
import com.example.demo.reposirories.RoomRepository;
import com.example.demo.service.exceptions.ReservationExceptions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ReservationServiceImpl implements ReservationService {
    final ReservationRepository reservationRepository;
    final RoomRepository roomRepository;
    final ReservationConvert reservationConvert;

    public ReservationServiceImpl(ReservationRepository reservationRepository,
                                  RoomRepository roomRepository,
                                  ReservationConvert reservationConvert) {
        this.reservationRepository = reservationRepository;

        this.roomRepository = roomRepository;
        this.reservationConvert = reservationConvert;
    }

    @Override
    public ReservationDTO createReservation(ReservationDTO reservationDTO) throws RuntimeException {
        ReservationEntity save = reservationRepository.save(reservationConvert.toReservationEntity(reservationDTO));

        return reservationConvert.toReservationDTO(save);
    }

    @Override
    public ReservationDTO editReservation(ReservationDTO reservationDTO) {
        ReservationEntity save = reservationRepository.save(reservationConvert.toReservationEntity(reservationDTO));

        return reservationConvert.toReservationDTO(save);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Iterable<ReservationEntity> reservationAll() {
        return reservationRepository.findAll();
    }

    @Override
    public boolean isExistsReservation(List<ReservationEntity> reservationEntityList, Date dateFrom, Date dateTo) {

        return reservationEntityList.stream().anyMatch(it ->
                dateFrom.before(it.getCheckFrom()) && it.getCheckTo().before(dateTo));
    }

    @Override
    public boolean checkAvailabilityForBooking(int number, Date dateFrom, Date dateTo) {
        RoomEntity room = roomRepository.findByNumber(number);
        return !isExistsReservation(room.reservationEntityList, dateFrom, dateTo);
    }


}
