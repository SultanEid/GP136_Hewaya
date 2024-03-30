package com.hewayah.hello_world.controller;
import com.hewayah.hello_world.entity.UserEntity;
import com.hewayah.hello_world.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
@GetMapping("/getALLuser")
    public List<UserEntity> getALLuser(){
        return this.userDao.getALLuser();
    }



    @GetMapping(path="/user-by-username/{username}")
    public Optional<Optional<UserEntity>> getById(@PathVariable String username) {
        return Optional.ofNullable(this.userDao.getById(username));
    }
    @PostMapping("/createUser")
    public UserEntity createUser(@RequestBody UserEntity username) {
        return this.userDao.createUser(username);
    }

    @PostMapping("/updateUser")
    public UserEntity updateUser(@PathVariable String username, @RequestBody UserEntity updatedUser){
    return this.userDao.updateUser(username,updatedUser);
    }
    @DeleteMapping("/deleteUser/{username}")
    public void deleteUser(@PathVariable String username){
     this.userDao.deleteUser(username);
    }
}

