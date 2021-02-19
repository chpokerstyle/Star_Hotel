package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "guest")
@Data
public class GuestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String family;

    @ManyToOne(targetEntity = RoomModel.class, fetch = FetchType.LAZY)
    RoomModel roomModel;

    @OneToOne(cascade = CascadeType.ALL)
    ReservModel reservModel;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<RoomModel>roomModelList;
}
