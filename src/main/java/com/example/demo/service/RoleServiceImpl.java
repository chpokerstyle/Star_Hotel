package com.example.demo.service;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.mappers.RoleMapper;
import com.example.demo.model.RoleEntity;
import com.example.demo.reposirories.RoleRepository;
import com.example.demo.service.interfaces.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleServiceImpl implements RoleService {

    final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public RoleDTO create(RoleDTO roleDTO) {
        RoleEntity saveRole = roleRepository.save(RoleMapper.INSTANCE.toEntity(roleDTO));
        return RoleMapper.INSTANCE.toDTO(saveRole);
    }

    @Override
    public void delete(Long id) {
    roleRepository.deleteById(id);
    }

    @Override
    public RoleDTO edit(RoleDTO roleDTO) {
        RoleEntity saveRole = roleRepository.save(RoleMapper.INSTANCE.toEntity(roleDTO));
        return RoleMapper.INSTANCE.toDTO(saveRole);
    }

    @Override
    public List<RoleDTO> getAll() {
        return roleRepository.findAll()
                .stream()
                .map(RoleMapper.INSTANCE::toDTO)
                .collect(Collectors.toList());
    }
}
