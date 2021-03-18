package com.example.demo.DTO.converter;

import com.example.demo.DTO.modelDTO.UserDTO;
import com.example.demo.model.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity toUserEntity;

    public UserEntity toUserEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setNumber(userDTO.getNumber());
        userEntity.setLogin(userDTO.getLogin());
        userEntity.setPassword(userDTO.getPassword());
        return userEntity;
    }

    public UserDTO toUserDTO(UserEntity userEntity){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setLastName(userEntity.getLastName());
        userDTO.setFirstName(userEntity.getFirstName());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setNumber(userEntity.getNumber());
        userDTO.setLogin(userEntity.getLogin());
        userDTO.setPassword(userEntity.getPassword());
        return userDTO;
    }
}
