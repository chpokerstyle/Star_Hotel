package com.example.demo.rest;

import com.example.demo.DTO.UserDTO;
import com.example.demo.service.UserServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserServiceImpl service;

    public UserController(UserServiceImpl service) {
        this.service = service;
    }
    @PostMapping("/create")
    public UserDTO create(@RequestBody UserDTO userDTO){
        return service.create(userDTO);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
    @PutMapping("/edit")
    public UserDTO edit(@RequestBody UserDTO userDTO){
        return service.edit(userDTO);
    }
    @GetMapping("/all")
    public List<UserDTO> getAll(){
        return service.getAll();
    }
    @GetMapping("/find/{lastName}")
    public List<UserDTO> findByLastName(@PathVariable String lastName){
        return service.findByLastName(lastName);
    }
    @GetMapping("/find/{firstName")
    public List<UserDTO>findByFirstName(@PathVariable String firstName){
        return service.findByFirstName(firstName);
    }
    @GetMapping("/find/{number}")
    public UserDTO findByNumber(@PathVariable String number){
        return service.findByNumber(number);
    }
    @GetMapping("find/{email}")
    public UserDTO findByEmail(@PathVariable String email){
        return service.findByEmail(email);
    }
}
