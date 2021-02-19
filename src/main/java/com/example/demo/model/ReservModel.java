package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "reserved")
@Data
public class ReservModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(targetEntity = RoomModel.class, fetch = FetchType.LAZY)
    RoomModel roomModel;
    @OneToOne(cascade = CascadeType.ALL)
    GuestModel guestModel;
}
