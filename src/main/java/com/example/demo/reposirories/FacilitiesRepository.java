package com.example.demo.reposirories;

import com.example.demo.model.FacilitiesEntity;
import org.springframework.data.repository.CrudRepository;

public interface FacilitiesRepository extends CrudRepository<FacilitiesEntity, Long> {
    public FacilitiesEntity findByName(String name);
    public void deleteById(Long id);
}
