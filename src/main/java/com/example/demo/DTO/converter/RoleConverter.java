package com.example.demo.DTO.converter;

import com.example.demo.DTO.modelDTO.RoleDTO;
import com.example.demo.model.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleConverter {
    public RoleEntity toRoleEntity(RoleDTO roleDTO){
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(roleDTO.getId());
        roleEntity.setName(roleDTO.getName());
        return roleEntity;
    }
    public RoleDTO toRoleDTO(RoleEntity roleEntity){
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(roleEntity.getId());
        roleDTO.setName(roleEntity.getName());
        return roleDTO;
    }
}
