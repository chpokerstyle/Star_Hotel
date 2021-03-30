package com.example.demo.service.interfaces;

import com.example.demo.DTO.FacilitiesDTO;

import java.util.List;

public interface FacilitiesService {
    FacilitiesDTO create(FacilitiesDTO facilitiesDTO);
    void delete(Long id);
    FacilitiesDTO edit(FacilitiesDTO facilitiesDTO);
    List<FacilitiesDTO> getAll();
    List<FacilitiesDTO> findByName(String name);
}
