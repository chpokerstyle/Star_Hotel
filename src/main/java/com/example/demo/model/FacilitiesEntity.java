package com.example.demo.model;

import com.example.demo.DTO.RoomDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "facilities")
@Data
public class FacilitiesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
            @JoinTable(
                    schema = "public",
                    name = "facilities_room",
                    joinColumns = @JoinColumn(name = "facilities_id"),
                    inverseJoinColumns = @JoinColumn(name = "room_id")
            )
    List<RoomEntity>roomEntityList;

}
