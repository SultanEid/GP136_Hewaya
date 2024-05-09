package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.User;
import com.hewayah.hello_world.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(Long id, User updatedUser) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User user = existingUser.get();
            user.setUsername(updatedUser.getUsername());
            user.setPassword(updatedUser.getPassword());
            user.setEmail(updatedUser.getEmail());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setUserType(updatedUser.getUserType());
            user.setName(updatedUser.getName());
            user.setBio(updatedUser.getBio());
            user.setGender(updatedUser.getGender());
            return userRepository.save(user);
        } else {
            throw new IllegalArgumentException("User with ID " + id + " not found");
        }
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}