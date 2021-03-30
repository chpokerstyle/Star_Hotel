package com.example.demo.rest;

import com.example.demo.DTO.RoomDTO;
import com.example.demo.service.interfaces.RoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/room")
public class RoomController {

    final RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @PostMapping("/create")
    public RoomDTO create(@RequestBody RoomDTO roomDTO){
        return roomService.create(roomDTO);
    }

    @PutMapping("/edit")
    public RoomDTO edit(@RequestBody RoomDTO roomDTO){
        return roomService.edit(roomDTO);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") Long id){
        roomService.delete(id);
    }

    @GetMapping("/all")
    public List<RoomDTO>roomAll(){
        return roomService.getAll();
    }

    @GetMapping("/find/room")
    RoomDTO findByNumber(@RequestParam(value = "/number") int numbers){
        return roomService.findByNumber(numbers);
    }

    @GetMapping("/sorting")
    List<RoomDTO> findAllSortingByPersons(@RequestParam(value = "/persons") int persons){
        return roomService.findAllSortingByPersons(persons);
    }
}
