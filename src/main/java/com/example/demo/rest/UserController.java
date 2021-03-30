package com.example.demo.rest;

import com.example.demo.DTO.UserDTO;
import com.example.demo.service.interfaces.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/create")
    public UserDTO create(@RequestBody UserDTO userDTO){
        return userService.create(userDTO);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam(value = "id") Long id){
        userService.delete(id);
    }
    @PutMapping("/edit")
    public UserDTO edit(@RequestBody UserDTO userDTO){
        return userService.edit(userDTO);
    }
    @GetMapping("/all")
    public List<UserDTO> getAll(){
        return userService.getAll();
    }
    @GetMapping("/find/name")
    public List<UserDTO> findByLastName(@RequestParam(value = "last_name") String lastName){
        return userService.findByLastName(lastName);
    }
    @GetMapping("/find/family")
    public List<UserDTO>findByFirstName(@RequestParam(value = "first_name") String firstName){
        return userService.findByFirstName(firstName);
    }
    @GetMapping("/find/number")
    public UserDTO findByNumber(@RequestParam(value = "number") String number){
        return userService.findByNumber(number);
    }
    @GetMapping("find/email")
    public UserDTO findByEmail(@RequestParam(value = "email") String email){
        return userService.findByEmail(email);
    }
}
