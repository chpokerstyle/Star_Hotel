package com.example.demo.reposirories;

import com.example.demo.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByEmail(String email);
    UserEntity findByNumber(String number);
    List<UserEntity> findByFirstName(String firstName);
    List<UserEntity> findByLastName(String lastName);

}
