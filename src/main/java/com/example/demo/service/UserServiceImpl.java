package com.example.demo.service;

import com.example.demo.DTO.converter.UserConverter;
import com.example.demo.DTO.modelDTO.UserDTO;
import com.example.demo.model.UserEntity;
import com.example.demo.reposirories.UserRepository;

public class UserServiceImpl implements UserService {
    final UserRepository userRepository;
    final UserConverter converter;


    public UserServiceImpl(UserRepository userRepository, UserConverter converter) {
        this.userRepository = userRepository;
        this.converter = converter;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity save = userRepository.save(converter.toUserEntity(userDTO));
        return converter.toUserDTO(save);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        UserEntity edit = userRepository.save(converter.toUserEntity(userDTO));
        return converter.toUserDTO(edit);
    }

    @Override
    public Iterable<UserEntity> userAll() {
        return userRepository.findAll();
    }
    @Override
    public Iterable<UserEntity> userFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @Override
    public Iterable<UserEntity> userLastName(String lastName) {
        return userRepository.findByLastName(lastName);
    }

    @Override
    public UserEntity findByNumber(String number) {
        return userRepository.findByNumber(number);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
