package com.example.demo.service.interfaces;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.model.RoleEntity;

import java.util.List;

public interface RoleService {
    RoleDTO create(RoleDTO roleDTO);
    void delete(Long id);
    RoleDTO edit(RoleDTO roleDTO);
    List<RoleDTO> getAll();
}
