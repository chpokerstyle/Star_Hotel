package com.example.demo.service;

import com.example.demo.DTO.ReservationDTO;
import com.example.demo.mappers.ReservationMapper;
import com.example.demo.model.ReservationEntity;
import com.example.demo.reposirories.ReservationRepository;
import com.example.demo.reposirories.RoomRepository;
import com.example.demo.service.interfaces.ReservationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReservationServiceImpl implements ReservationService {
    final ReservationRepository reservationRepository;
    final RoomRepository roomRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository, RoomRepository roomRepository) {
        this.reservationRepository = reservationRepository;
        this.roomRepository = roomRepository;
    }

    @Override
    public ReservationDTO create(ReservationDTO reservationDTO)// throws RuntimeException
    {
        ReservationEntity save = reservationRepository.save(ReservationMapper.INSTANCE.toEntity(reservationDTO));

        return ReservationMapper.INSTANCE.toDTO(save);
    }

    @Override
    public ReservationDTO edit(ReservationDTO reservationDTO) {
        ReservationEntity edit = reservationRepository.save(ReservationMapper.INSTANCE.toEntity(reservationDTO));

        return ReservationMapper.INSTANCE.toDTO(edit);
    }

    @Override
    public void delete(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<ReservationDTO> getAll() {

        return reservationRepository.findAll()
                .stream()
                .map(ReservationMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

//    @Override
//    public boolean isExistsReservation(List<ReservationEntity> reservationEntity, Date dateFrom, Date dateTo) {
//
//        return reservationEntity.stream()
//                .anyMatch(it ->
//                dateFrom.before(it.getCheckFrom()) && it.getCheckTo().before(dateTo));
//    }
//
//    @Override
//    public boolean checkAvailabilityForBooking(int number, Date dateFrom, Date dateTo) {
//        RoomEntity room = roomRepository.findByNumber(number);
//        return !isExistsReservation(room.reservationEntityList, dateFrom, dateTo);
//    }
}
