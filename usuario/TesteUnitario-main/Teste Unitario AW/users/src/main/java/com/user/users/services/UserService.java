package com.user.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.users.model.User;
import com.user.users.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> listaUser() {
        return userRepository.findAll();
    }

    public User salvarUser(User user) {
        return userRepository.save(user);
    }

}
