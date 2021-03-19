package com.example.demo.rest;

import com.example.demo.DTO.modelDTO.RoomDTO;
import com.example.demo.model.RoomEntity;
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
    public RoomDTO create(RoomDTO roomDTO){
        return roomService.createRoom(roomDTO);
    }

    @PutMapping("/edit")
    public RoomDTO edit(RoomDTO roomDTO){
        return roomService.editRoom(roomDTO);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") Long id){
        roomService.deleteRoom(id);
    }

    @GetMapping("/all")
    public Iterable<RoomEntity>all(){
        return roomService.roomAll();
    }

    @GetMapping("/find/room")
    RoomEntity findByNumber(@RequestParam(value = "/number") int numbers){
        return roomService.findByNumber(numbers);
    }

    @GetMapping("/sorting")
    List<RoomEntity> findAllSortingByPersons(@RequestParam(value = "/persons") int persons){
        return roomService.findAllSortingByPersons(persons);
    }
}
