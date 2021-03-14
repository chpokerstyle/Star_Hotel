package com.example.demo.DTO.modelDTO;

import lombok.Data;

@Data
public class UserDTO {
    Long id;
    String firstName;
    String lastName;
    String login;
    String password;
    String number;
    String email;
}
