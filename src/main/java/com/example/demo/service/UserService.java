package com.example.demo.service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;


public interface UserService {

    void addUser(UserDto userDto);

    User getUserByName(String id);
}
