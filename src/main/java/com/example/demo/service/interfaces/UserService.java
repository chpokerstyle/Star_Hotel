package com.example.demo.service.interfaces;

import com.example.demo.DTO.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO create(UserDTO userDTO);
    void delete(Long id);
    UserDTO edit(UserDTO userDTO);
    List<UserDTO> getAll();
    List<UserDTO> findByLastName(String lastName);
    List<UserDTO> findByFirstName(String firstName);
    UserDTO findByNumber(String number);
    UserDTO findByEmail(String email);
}
