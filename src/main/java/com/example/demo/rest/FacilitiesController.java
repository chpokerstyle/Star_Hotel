package com.example.demo.rest;

import com.example.demo.DTO.modelDTO.FacilitiesDTO;
import com.example.demo.model.FacilitiesEntity;
import com.example.demo.service.FacilitiesService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facilities")
public class FacilitiesController {
    final FacilitiesService facilitiesService;

    public FacilitiesController(FacilitiesService facilitiesService) {
        this.facilitiesService = facilitiesService;
    }

    @PostMapping("/create")
    public FacilitiesDTO createFacilities(FacilitiesDTO facilitiesDTO){
    return facilitiesService.createFacilities(facilitiesDTO);
    }


}
