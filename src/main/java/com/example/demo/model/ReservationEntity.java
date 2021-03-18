package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "reserved")
@Data
public class ReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date checkFrom;
    Date checkTo;
    int persons;

    @ManyToOne(targetEntity = RoomEntity.class, fetch = FetchType.LAZY)
    RoomEntity roomEntity;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    UserEntity userEntity;

}
