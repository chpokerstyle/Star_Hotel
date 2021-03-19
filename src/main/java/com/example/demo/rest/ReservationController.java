package com.example.demo.rest;

import com.example.demo.DTO.modelDTO.ReservationDTO;
import com.example.demo.model.ReservationEntity;
import com.example.demo.service.exceptions.ReservationExceptions;
import com.example.demo.service.interfaces.ReservationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facilities")
public class ReservationController {
    final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @PostMapping("/create")
    public ReservationDTO createReservation(ReservationDTO reservationDTO) {
        return reservationService.createReservation(reservationDTO);
    }
    @PutMapping("/edit")
    public ReservationDTO editReservation(ReservationDTO reservationDTO){
        return reservationService.editReservation(reservationDTO);
    }
    @DeleteMapping("/delete")
    public void deleteReservation(@RequestParam(value = "id") Long id){
        reservationService.deleteReservation(id);
    }
    @GetMapping("/all")
    public Iterable<ReservationEntity>reservationAll(){
        return reservationService.reservationAll();
    }
}
