package com.metodo.api.services;

import com.metodo.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
