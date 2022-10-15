package com.example.demo.utill;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public class UserUtils {

    public static void createUserEntity(UserDto userDto, User user) {
        if(userDto != null) {
            user.setName(userDto.getName());
            user.setPinCode(userDto.getPinCode());
            user.setSirName(userDto.getSirName());
            user.setState(userDto.getState());
        }
    }
}
