package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import repository.UserRepository;



@RestController
@RequestMapping()
public class UserController {

//    @Autowired
//    private UserRepository userRepository;

    @GetMapping()
    public String getUsers() {
        return "dfa";
    }
}