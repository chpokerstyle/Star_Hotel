package com.example.demo.reposirories;

import com.example.demo.model.GuestModel;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<GuestModel,Long> {
}
