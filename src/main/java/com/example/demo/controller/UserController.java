package com.example.demo.controller;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/demo/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add")
    public void createNewUser(@RequestBody UserDto userDto) {
        userService.addUser(userDto);
    }

    @GetMapping("/id")
    public User getUserByName(@RequestParam String id) {
        return userService.getUserByName(id);
    }
}
