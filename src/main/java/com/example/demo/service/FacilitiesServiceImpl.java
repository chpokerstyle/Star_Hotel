package com.example.demo.service;

import com.example.demo.DTO.converter.FacilitiesConvert;
import com.example.demo.DTO.modelDTO.FacilitiesDTO;
import com.example.demo.model.FacilitiesEntity;
import com.example.demo.reposirories.FacilitiesRepository;
import com.example.demo.service.interfaces.FacilitiesService;
import org.springframework.stereotype.Service;

@Service
public class FacilitiesServiceImpl implements FacilitiesService {

    final FacilitiesRepository facilitiesRepository;
    final FacilitiesConvert facilitiesConvert;


    public FacilitiesServiceImpl(FacilitiesRepository facilitiesRepository, FacilitiesConvert facilitiesConvert) {
        this.facilitiesRepository = facilitiesRepository;
        this.facilitiesConvert = facilitiesConvert;

    }

    @Override
    public FacilitiesDTO createFacilities(FacilitiesDTO facilitiesDTO) {

        FacilitiesEntity saveFacilities = facilitiesRepository.save(facilitiesConvert.toFacilitiesEntity(facilitiesDTO));

        return facilitiesConvert.toFacilitiesDTO(saveFacilities);
    }

    @Override
    public void deleteFacilities(Long id) {
    facilitiesRepository.deleteById(id);
    }

    @Override
    public FacilitiesDTO editFacilities(FacilitiesDTO facilitiesDTO) {

        FacilitiesEntity saveFacilities = facilitiesRepository.save(facilitiesConvert.toFacilitiesEntity(facilitiesDTO));

        return facilitiesConvert.toFacilitiesDTO(saveFacilities);
    }

    @Override
    public Iterable<FacilitiesEntity> facilitiesAll() {
        return facilitiesRepository.findAll();
    }

    @Override
    public Iterable<FacilitiesEntity> findByName(String name) {
        return facilitiesRepository.findByName(name);
    }
}
