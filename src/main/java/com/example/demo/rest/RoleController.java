package com.example.demo.rest;

import com.example.demo.DTO.RoleDTO;
import com.example.demo.model.RoleEntity;
import com.example.demo.service.RoleServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    final RoleServiceImpl service;

    public RoleController(RoleServiceImpl service) {
        this.service = service;
    }
    @PostMapping("/create")
    public RoleDTO create(@RequestBody RoleDTO roleDTO){
        return service.create(roleDTO);
    }
    @PutMapping("/edit")
    public RoleDTO edit(@RequestBody RoleDTO roleDTO){
        return service.edit(roleDTO);
    }
    @GetMapping("/all")
    public List<RoleDTO> getAll(){
        return service.getAll();
    }
    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
