package com.example.demo.reposirories;

import com.example.demo.model.FacilitiesEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacilitiesRepository extends CrudRepository<FacilitiesEntity, Long> {
    List<FacilitiesEntity> findByName(String name);
    void deleteById(Long id);
}
