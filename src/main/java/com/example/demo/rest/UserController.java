package com.example.demo.rest;

import com.example.demo.DTO.modelDTO.UserDTO;
import com.example.demo.model.UserEntity;
import com.example.demo.service.interfaces.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/create")
    public UserDTO createUser(UserDTO userDTO){
        return userService.createUser(userDTO);
    }
    @DeleteMapping("/delete")
    public void deleteUser(@RequestParam(value = "id") Long id){
        userService.deleteUser(id);
    }
    @PutMapping("/edit")
    public UserDTO editUser(UserDTO userDTO){
        return userService.editUser(userDTO);
    }
    @GetMapping("/all")
    public Iterable<UserEntity>userAll(){
        return userService.userAll();
    }
    @GetMapping("/find/name")
    public Iterable<UserEntity> userLastName(@RequestParam(value = "last_name") String lastName){
        return userService.findByLastName(lastName);
    }
    @GetMapping("/find/family")
    public Iterable<UserEntity>findByFirstName(@RequestParam(value = "first_name") String firstName){
        return userService.findByFirstName(firstName);
    }
    @GetMapping("/find/number")
    public UserEntity findByNumber(@RequestParam(value = "number") String number){
        return userService.findByNumber(number);
    }
    @GetMapping("find/email")
    public UserEntity findByEmail(@RequestParam(value = "email") String email){
        return userService.findByEmail(email);
    }
}
