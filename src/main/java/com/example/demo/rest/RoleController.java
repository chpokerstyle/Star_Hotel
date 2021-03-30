package com.example.demo.rest;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.service.interfaces.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
    @PostMapping("/create")
    public RoleDTO create(@RequestBody RoleDTO roleDTO){
        return roleService.create(roleDTO);
    }
    @PutMapping("/edit")
    public RoleDTO edit(@RequestBody RoleDTO roleDTO){
        return roleService.edit(roleDTO);
    }
    @GetMapping("/all")
    public List<RoleDTO> roleAll(){
        return roleService.getAll();

    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") Long id){
        roleService.delete(id);
    }
}
