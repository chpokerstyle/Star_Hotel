package com.example.demo.rest;

import com.example.demo.DTO.modelDTO.FacilitiesDTO;
import com.example.demo.model.FacilitiesEntity;
import com.example.demo.service.interfaces.FacilitiesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {

    final FacilitiesService facilitiesService;

    public FacilitiesController(FacilitiesService facilitiesService) {
        this.facilitiesService = facilitiesService;
    }

    @PostMapping("/create")
    public FacilitiesDTO create(FacilitiesDTO facilitiesDTO){
       return facilitiesService.createFacilities(facilitiesDTO);
    }
    @PutMapping("/edit")
    public FacilitiesDTO edit(FacilitiesDTO facilitiesDTO){
        return facilitiesService.editFacilities(facilitiesDTO);
    }
    @GetMapping("/all")
    public Iterable<FacilitiesEntity> facilitiesAll(){
        return facilitiesService.facilitiesAll();
    }
    @DeleteMapping("/delete/")
    void delete (@RequestParam(value = "id") Long id){
        facilitiesService.deleteFacilities(id);
    }
}
