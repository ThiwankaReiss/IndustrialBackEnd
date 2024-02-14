package org.example.service.impl;

import org.example.dto.User;
import org.example.entity.UserEntity;
import org.example.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public UserEntity addUser(User user) {
        return null;
    }

    @Override
    public List<UserEntity> getUser() {
        return null;
    }

    @Override
    public User getUserId(String nic) {
        return null;
    }

    @Override
    public boolean deleteUser(String nic) {
        return false;
    }
}
