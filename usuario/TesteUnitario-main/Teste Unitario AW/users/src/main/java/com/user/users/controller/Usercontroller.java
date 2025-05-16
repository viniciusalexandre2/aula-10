package com.user.users.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.users.model.User;
import com.user.users.services.UserService;
@RestController
@RequestMapping("/user")
public class Usercontroller {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> ListaUser() {
        return userService.listaUser();
    }

    @PostMapping
    public ResponseEntity<User> salvarUser(@RequestBody User user) {
        User savedUser = userService.salvarUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
}
