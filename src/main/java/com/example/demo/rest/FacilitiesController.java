package com.example.demo.rest;

import com.example.demo.DTO.FacilitiesDTO;
import com.example.demo.service.interfaces.FacilitiesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {

    final FacilitiesService facilitiesService;

    public FacilitiesController(FacilitiesService facilitiesService) {
        this.facilitiesService = facilitiesService;
    }

    @PostMapping("/create")
    public FacilitiesDTO create(@RequestBody FacilitiesDTO facilitiesDTO){
       return facilitiesService.create(facilitiesDTO);
    }
    @PutMapping("/edit")
    public FacilitiesDTO edit(@RequestBody FacilitiesDTO facilitiesDTO){
        return facilitiesService.edit(facilitiesDTO);
    }
    @GetMapping("/all")
    public List<FacilitiesDTO> getAll(){
        return facilitiesService.getAll();
    }
    @DeleteMapping("/delete/")
    void delete (@RequestParam(value = "id") Long id){
        facilitiesService.delete(id);
    }
    @GetMapping("/find")
    public List<FacilitiesDTO>findByName(@RequestParam(value = "name") String name){
        return facilitiesService.findByName(name);
    }
}
