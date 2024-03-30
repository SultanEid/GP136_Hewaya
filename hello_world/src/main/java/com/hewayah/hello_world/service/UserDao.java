package com.hewayah.hello_world.service;
import com.hewayah.hello_world.entity.UserEntity;
import com.hewayah.hello_world.repository.UserRepo;
//import com.springdemo.hewayah.entity.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;
import java.util.Optional;

@Service
public class UserDao {

    @Autowired
    private UserRepo userRepo;




    public Optional<UserEntity> getById(String username) {
        return this.userRepo.findById(username);
    }
    public List<UserEntity> getALLuser(){
        return this.userRepo.findAll();
    }
    public UserEntity createUser(UserEntity username) {
        return this.userRepo.save(username);
    }
    public UserEntity updateUser(String username, UserEntity updatedUser) {
        Optional<UserEntity> existingUser = userRepo.findById(username);
        if (existingUser.isPresent()) {
            UserEntity user = existingUser.get();
            user.setUsername(updatedUser.getUsername());
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
            user.setUserType(updatedUser.getUserType());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setDateCreate(updatedUser.getDateCreate());
            user.setGender(updatedUser.getGender());
            return userRepo.save(user);

        }
        return null; // Or throw an exception indicating the user was not found
    }

    public void deleteUser(String username) {
        userRepo.deleteById(username);
    }
}
