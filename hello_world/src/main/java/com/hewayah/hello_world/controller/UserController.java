package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.entity.User;
import com.hewayah.hello_world.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAll() {
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping("create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);

    }
}
