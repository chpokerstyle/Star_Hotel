package com.example.demo.service.interfaces;

import com.example.demo.DTO.modelDTO.UserDTO;
import com.example.demo.model.UserEntity;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    void deleteUser(Long id);
    UserDTO editUser(UserDTO userDTO);
    Iterable<UserEntity>userAll();
    Iterable<UserEntity> findByLastName(String lastName);
    Iterable<UserEntity> findByFirstName(String firstName);
    UserEntity findByNumber(String number);
    UserEntity findByEmail(String email);
}
