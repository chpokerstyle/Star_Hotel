package com.example.demo.reposirories;

import com.example.demo.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
    UserEntity findByNumber(String number);
    List<UserEntity> findByFirstName(String firstName);
    List<UserEntity> findByLastName(String lastName);

}
