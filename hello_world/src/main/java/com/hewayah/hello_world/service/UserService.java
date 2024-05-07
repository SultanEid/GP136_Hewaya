package com.hewayah.hello_world.service;

//import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.entity.ServiceProvider;
import com.hewayah.hello_world.entity.User;
import com.hewayah.hello_world.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User createUser(User user) {

        return userRepository.save(user);
    }

}
