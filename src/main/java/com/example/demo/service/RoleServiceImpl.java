package com.example.demo.service;

import com.example.demo.DTO.converter.RoleConverter;
import com.example.demo.DTO.modelDTO.RoleDTO;
import com.example.demo.model.RoleEntity;
import com.example.demo.reposirories.RoleRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    final RoleRepository roleRepository;
    final RoleConverter converter;

    public RoleServiceImpl(RoleRepository roleRepository, RoleConverter converter) {
        this.roleRepository = roleRepository;
        this.converter = converter;
    }

    @Override
    public RoleDTO createRole(RoleDTO roleDTO) {
        RoleEntity saveRole = roleRepository.save(converter.toRoleEntity(roleDTO));
        return converter.toRoleDTO(saveRole);
    }

    @Override
    public void deleteRole(Long id) {
    roleRepository.deleteById(id);
    }

    @Override
    public RoleDTO edit(RoleDTO roleDTO) {
        RoleEntity saveRole = roleRepository.save(converter.toRoleEntity(roleDTO));
        return converter.toRoleDTO(saveRole);
    }

    @Override
    public Iterable<RoleEntity> roleAll() {
        return roleRepository.findAll();
    }
}
