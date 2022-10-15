package com.example.demo.service.impl;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.storage.MapStorage;
import com.example.demo.utill.UserUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public void addUser(UserDto userDto) {
        log.info("all users : {}", MapStorage.userMap);
        if(!MapStorage.userMap.containsKey(userDto.getUserId())) {
            User user = new User();
            UserUtils.createUserEntity(userDto, user);
            MapStorage.userMap.put(user.getUserId(), user);
        }
    }

    @Override
    public User getUserByName(String id) {
        if(MapStorage.userMap.containsKey(id)) {
            return MapStorage.userMap.get(id);
        }
        return null;
    }
}
