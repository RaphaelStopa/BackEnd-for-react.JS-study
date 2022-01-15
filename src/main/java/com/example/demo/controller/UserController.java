package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import repository.UserRepository;


// todo isto eh importante, esquecer
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("users")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}