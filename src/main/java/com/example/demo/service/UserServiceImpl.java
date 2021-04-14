package com.example.demo.service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.mappers.UserMapper;
import com.example.demo.model.UserEntity;
import com.example.demo.reposirories.UserRepository;
import com.example.demo.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        UserEntity save = userRepository.save(UserMapper.INSTANCE.toEntity(userDTO));
        return UserMapper.INSTANCE.toDTO(save);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public UserDTO edit(UserDTO userDTO) {
        UserEntity edit = userRepository.save(UserMapper.INSTANCE.toEntity(userDTO));
        return UserMapper.INSTANCE.toDTO(edit);
    }

    @Override
    public List<UserDTO> getAll() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
    @Override
    public List<UserDTO> findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName)
                .stream()
                .map(UserMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> findByLastName(String lastName) {
        return userRepository.findByLastName(lastName)
                .stream()
                .map(UserMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public UserDTO findByNumber(String number) {
        UserEntity entity = userRepository.findByNumber(number);
        return UserMapper.INSTANCE.toDTO(entity);
    }

    @Override
    public UserDTO findByEmail(String email) {
        UserEntity entity = userRepository.findByEmail(email);
        return UserMapper.INSTANCE.toDTO(entity);
    }
}
