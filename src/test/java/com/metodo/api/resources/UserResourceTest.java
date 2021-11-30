package com.metodo.api.resources;

import com.metodo.api.domain.User;
import com.metodo.api.domain.dto.UserDTO;
import com.metodo.api.services.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserResourceTest {

    public static final Integer ID       = 1;
    public static final String  NAME     = "Alef";
    public static final String  EMAIL    = "alef@gmail.com";
    public static final String  PASSWORD = "123";
    public static final String OBJECT_NOT_FOUND = "Objeto não encontrado, id: ";
    public static final int INDEX = 0;
    public static final String EMAIL_EXIST_IN_THE_SYSTEM = "Email exist in the system!";

    private User user;
    private UserDTO userDTO;


    @InjectMocks
    private UserResource resource;

    @Mock
    private UserServiceImpl service;

    @Mock
    private ModelMapper mapper;



    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        startUser();
    }

    @Test
    void findById() {
    }

    @Test
    void findAll() {
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    private void startUser(){
        user = new User(ID, NAME, EMAIL, PASSWORD);
        userDTO = new UserDTO(ID,NAME,EMAIL,PASSWORD);
    }
}