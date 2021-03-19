package com.example.demo.service.interfaces;

import com.example.demo.DTO.modelDTO.RoleDTO;
import com.example.demo.model.RoleEntity;

public interface RoleService {
    RoleDTO createRole(RoleDTO roleDTO);
    void deleteRole(Long id);
    RoleDTO edit(RoleDTO roleDTO);
    Iterable<RoleEntity>roleAll();
}
