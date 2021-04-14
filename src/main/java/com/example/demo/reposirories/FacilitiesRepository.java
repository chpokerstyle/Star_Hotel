package com.example.demo.reposirories;

import com.example.demo.model.FacilitiesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FacilitiesRepository extends JpaRepository<FacilitiesEntity, Long> {

    List<FacilitiesEntity> findByName(String name);
    void deleteById(Long id);
}
