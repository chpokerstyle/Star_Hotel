package com.example.demo.reposirories;

import com.example.demo.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    void deleteById(Long id);
}
