package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "reserved")
@Data
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(targetEntity = RoomEntity.class, fetch = FetchType.LAZY)
    RoomEntity roomEntity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    UserEntity userEntity;
}
