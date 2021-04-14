package com.example.demo.rest;

import com.example.demo.DTO.RoomDTO;
import com.example.demo.service.RoomServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    final RoomServiceImpl service;

    public RoomController(RoomServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/create")
    public RoomDTO create(@RequestBody RoomDTO roomDTO){
        return service.create(roomDTO);
    }

    @PutMapping("/edit")
    public RoomDTO edit(@RequestBody RoomDTO roomDTO){
        return service.edit(roomDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/all")
    public List<RoomDTO>roomAll(){
        return service.getAll();
    }

    @GetMapping("/find/room/{numbers}")
    RoomDTO findByNumber(@PathVariable int numbers){
        return service.findByNumber(numbers);
    }

    @GetMapping("/sorting/{persons}")
    List<RoomDTO> findAllSortingByPersons(@PathVariable int persons){
        return service.findAllSortingByPersons(persons);
    }
}
