package com.example.demo.rest;

import com.example.demo.DTO.ReservationDTO;
import com.example.demo.service.ReservationServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    final ReservationServiceImpl service;

    public ReservationController(ReservationServiceImpl service) {
        this.service = service;
    }
    @PostMapping("/create")
    public ReservationDTO create(@RequestBody ReservationDTO reservationDTO) {
        return service.create(reservationDTO);
    }
    @PutMapping("/edit")
    public ReservationDTO edit(@RequestBody ReservationDTO reservationDTO){
        return service.edit(reservationDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    @GetMapping("/all")
    public List<ReservationDTO> getAll(){
        return service.getAll();
    }
}
