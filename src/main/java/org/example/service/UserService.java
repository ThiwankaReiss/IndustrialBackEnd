package org.example.service;

import org.example.dto.User;
import org.example.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity addUser(User user);
    List<UserEntity> getUser();
    User getUserId(String nic);
    boolean deleteUser(String nic);
}
