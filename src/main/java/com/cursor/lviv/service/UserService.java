package com.cursor.lviv.service;

import com.cursor.lviv.helper.UserValidator;
import com.cursor.lviv.models.User;
import com.cursor.lviv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    @Qualifier("wa")
    private Sender sender;

    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }


    public void createUser(User user) {
        userRepository.createUser(user);
    }
}

//BEAN SCOPE'S: Singelton, Prototype

// scan beans // factorymethod -> BPP,
// @PostConstruct(init()) -> BPP, INJECT(@Autowired), @Destroy(Singelton)