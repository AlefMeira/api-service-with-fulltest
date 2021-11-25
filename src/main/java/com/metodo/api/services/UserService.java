package com.metodo.api.services;

import com.metodo.api.domain.User;
import com.metodo.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
