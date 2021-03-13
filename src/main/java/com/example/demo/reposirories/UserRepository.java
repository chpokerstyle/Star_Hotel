package com.example.demo.reposirories;

import com.example.demo.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
    public UserEntity findById(long id);
    public UserEntity findByEmail(String email);
    public UserEntity findByNumber(String number);
    public UserEntity findByFirstName(String firstName);
    public UserEntity findByLastName(String lastName);
}
