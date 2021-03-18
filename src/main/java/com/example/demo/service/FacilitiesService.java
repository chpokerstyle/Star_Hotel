package com.example.demo.service;

import com.example.demo.DTO.modelDTO.FacilitiesDTO;
import com.example.demo.model.FacilitiesEntity;

public interface FacilitiesService {
    FacilitiesDTO createFacilities(FacilitiesDTO facilitiesDTO);
    void deleteFacilities(Long id);
    FacilitiesDTO editFacilities(FacilitiesDTO facilitiesDTO);
    Iterable<FacilitiesEntity>facilitiesAll();
    Iterable<FacilitiesEntity>findByName(String name);
}
