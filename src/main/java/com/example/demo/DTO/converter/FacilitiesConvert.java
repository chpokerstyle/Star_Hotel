package com.example.demo.DTO.converter;

import com.example.demo.DTO.modelDTO.FacilitiesDTO;
import com.example.demo.model.FacilitiesEntity;
import org.springframework.stereotype.Component;

@Component
public class FacilitiesConvert {
    public FacilitiesEntity toFacilitiesEntity(FacilitiesDTO facilitiesDTO){
        FacilitiesEntity facilitiesEntity = new FacilitiesEntity();
        facilitiesEntity.setId(facilitiesDTO.getId());
        facilitiesEntity.setName(facilitiesDTO.getName());
        facilitiesEntity.setRoomEntityList(facilitiesDTO.getRoomDTOList());
        return facilitiesEntity;
    }

    public FacilitiesDTO toFacilitiesDTO(FacilitiesEntity facilitiesEntity){
        FacilitiesDTO facilitiesDTO = new FacilitiesDTO();
        facilitiesDTO.setId(facilitiesEntity.getId());
        facilitiesDTO.setName(facilitiesEntity.getName());
        facilitiesDTO.setRoomDTOList(facilitiesEntity.getRoomEntityList());
        return facilitiesDTO;
    }
}
