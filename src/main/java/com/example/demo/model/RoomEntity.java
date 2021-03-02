package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "room")
@Data
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String numberOfBerth;
    Date checkIn;
    Date checkDown;

    @OneToMany(mappedBy = "roomEntity", fetch = FetchType.LAZY)
    Set<ReservationEntity> reservationEntitySet;


    @ManyToMany(mappedBy = "roomEntityList", fetch = FetchType.EAGER)
    List<FacilitiesEntity>facilitiesEntityList;
}