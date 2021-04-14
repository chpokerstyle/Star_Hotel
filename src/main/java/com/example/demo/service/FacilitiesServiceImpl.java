package com.example.demo.service;

import com.example.demo.DTO.FacilitiesDTO;
import com.example.demo.mappers.FacilitiesMapper;
import com.example.demo.model.FacilitiesEntity;
import com.example.demo.reposirories.FacilitiesRepository;
import com.example.demo.service.interfaces.FacilitiesService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FacilitiesServiceImpl implements FacilitiesService {

    final FacilitiesRepository facilitiesRepository;

    public FacilitiesServiceImpl(FacilitiesRepository facilitiesRepository) {
        this.facilitiesRepository = facilitiesRepository;
    }

    @Override
    public FacilitiesDTO create(FacilitiesDTO facilitiesDTO) {

        FacilitiesEntity saveFacilities = facilitiesRepository.save(FacilitiesMapper.INSTANCE.toEntity(facilitiesDTO));
        return FacilitiesMapper.INSTANCE.toDTO(saveFacilities);
    }

    @Override
    public void delete(Long id) {
    facilitiesRepository.deleteById(id);
    }

    @Override
    public FacilitiesDTO edit(FacilitiesDTO facilitiesDTO) {

        FacilitiesEntity save = facilitiesRepository.save(FacilitiesMapper.INSTANCE.toEntity(facilitiesDTO));
        return FacilitiesMapper.INSTANCE.toDTO(save);
    }

    @Override
    public List<FacilitiesDTO> getAll() {
        return facilitiesRepository.findAll()
                .stream()
                .map(FacilitiesMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<FacilitiesDTO> findByName(String name) {

        return facilitiesRepository.findByName(name).stream()
                .map(FacilitiesMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
}
