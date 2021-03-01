package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String firstName;
    String lastName;
    String login;
    String password;
    String number;
    String email;

    @OneToOne
    ReservedEntity reservedEntity;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<RoleEntity>roleEntityList;
}
