package com.metodo.api.services.impl;

import com.metodo.api.domain.User;
import com.metodo.api.domain.dto.UserDTO;
import com.metodo.api.repositories.UserRepository;
import com.metodo.api.services.UserService;
import com.metodo.api.services.exceptions.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrado, id: "+ id ));
    }

    @Override
    public List<User> findAll(){
        return repository.findAll();
    }

    @Override
    public User create(UserDTO obj) {
        obj.setId(null);
       return repository.save(mapper.map(obj, User.class));
    }

}
