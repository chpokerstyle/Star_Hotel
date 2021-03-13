package com.example.demo.DTO.modelDTO;

import com.example.demo.model.RoomEntity;
import lombok.Data;

import java.util.List;

@Data
public class FacilitiesDTO {
    Long id;
    String name;
    List<RoomDTO>roomDTOList;

    public void setRoomDTOList(List<RoomEntity> roomEntityList) {
    }
}
