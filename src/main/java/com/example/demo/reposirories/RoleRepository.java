package com.example.demo.reposirories;

import com.example.demo.model.RoleEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleEntity, Long> {
    void deleteById(Long id);
}
