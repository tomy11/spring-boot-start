package com.hosnet.net.controller;

import com.hosnet.net.model.User;
import com.hosnet.net.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/list")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PostMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping("delete/{id}")
    public void deleteUser(Long id) {
        userService.deleteUser(id);
    }

}
