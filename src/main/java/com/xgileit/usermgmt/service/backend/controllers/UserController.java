package com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.controllers;

import com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.entities.User;
import com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.repositories.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/test")
    public String test()
    {
        return "All good !!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
