package com.example.demo.rest;

import com.example.demo.DTO.ReservationDTO;
import com.example.demo.service.interfaces.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    final ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }
    @PostMapping("/create")
    public ReservationDTO create(@RequestBody ReservationDTO reservationDTO) {
        return reservationService.create(reservationDTO);
    }
    @PutMapping("/edit")
    public ReservationDTO edit(@RequestBody ReservationDTO reservationDTO){
        return reservationService.edit(reservationDTO);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") Long id){
        reservationService.delete(id);
    }
    @GetMapping("/all")
    public List<ReservationDTO> getAll(){
        return reservationService.getAll();
    }
}
