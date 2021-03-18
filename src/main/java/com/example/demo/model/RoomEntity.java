package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "room")
@Data
public class RoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int number;
    int persons;

    @OneToMany(mappedBy = "roomEntity", fetch = FetchType.LAZY)
    public List<ReservationEntity> reservationEntityList;


    @ManyToMany(mappedBy = "roomEntityList", fetch = FetchType.EAGER)
    public List<FacilitiesEntity>facilitiesEntityList;
}