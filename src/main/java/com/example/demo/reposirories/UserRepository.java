package com.example.demo.reposirories;

import com.example.demo.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;


public interface UserRepository extends CrudRepository<UserEntity, Long> {

    public UserEntity findByEmail(String email);
    public UserEntity findByNumber(String number);
    List<UserEntity> findByFirstName(String firstName);
    List<UserEntity> findByLastName(String lastName);

}
