package com.example.demo.rest;

import com.example.demo.DTO.FacilitiesDTO;
import com.example.demo.service.FacilitiesServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {

    final FacilitiesServiceImpl service;

    public FacilitiesController(FacilitiesServiceImpl service) {
        this.service = service;
    }

    @PostMapping("/create")
    public FacilitiesDTO create(@RequestBody FacilitiesDTO facilitiesDTO){
       return service.create(facilitiesDTO);
    }
    @PutMapping("/edit")
    public FacilitiesDTO edit(@RequestBody FacilitiesDTO facilitiesDTO){
        return service.edit(facilitiesDTO);
    }
    @GetMapping("/all")
    public List<FacilitiesDTO> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete/{id}")
    void delete (@PathVariable Long id){
        service.delete(id);
    }
    @GetMapping("/find")
    public List<FacilitiesDTO>findByName(@RequestParam(value = "name") String name){
        return service.findByName(name);
    }
}