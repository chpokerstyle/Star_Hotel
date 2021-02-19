package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "room")
@Data
public class RoomModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String numberOfBerth;
    Date checkIn;
    Date checkDown;

    @OneToMany(mappedBy = "roomModel", fetch = FetchType.LAZY)
    Set<ReservModel>reservModelSet;

    @ManyToMany(mappedBy = "roomModelList", fetch = FetchType.EAGER)
    List<GuestModel>guestModelList;
}
