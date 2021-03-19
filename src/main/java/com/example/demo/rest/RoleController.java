package com.example.demo.rest;

import com.example.demo.DTO.modelDTO.RoleDTO;
import com.example.demo.model.RoleEntity;
import com.example.demo.service.interfaces.RoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
    @PostMapping("/create")
    public RoleDTO create(RoleDTO roleDTO){
        return roleService.createRole(roleDTO);
    }
    @PutMapping("/edit")
    public RoleDTO edit(RoleDTO roleDTO){
        return roleService.edit(roleDTO);
    }
    @GetMapping("/all")
    public Iterable<RoleEntity>all(){
        return roleService.roleAll();
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") Long id){
        roleService.deleteRole(id);
    }
}
