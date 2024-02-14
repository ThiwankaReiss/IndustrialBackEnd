package org.example.service;

import org.example.dto.TIN;
import org.example.dto.User;
import org.example.entity.TINEntity;
import org.example.entity.UserEntity;

import java.util.List;

public interface TNIService {
    TINEntity addTIN(TIN tin);
    List<TINEntity> getBooks();
    User getTINById(String nic);

    boolean deleteTIN(String nic);
}
