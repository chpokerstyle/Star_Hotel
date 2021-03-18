package com.example.demo.service;

import com.example.demo.DTO.modelDTO.UserDTO;
import com.example.demo.model.UserEntity;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    void deleteUser(Long id);
    UserDTO editUser(UserDTO userDTO);
    Iterable<UserEntity>userAll();
    Iterable<UserEntity> userLastName(String lastName);
    Iterable<UserEntity> userFirstName(String firstName);
    UserEntity findByNumber(String number);
    UserEntity findByEmail(String email);
}
