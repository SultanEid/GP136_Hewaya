package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.HobbyEntity;
import com.hewayah.hello_world.service.HobbyDao;
import org.springframework.beans.factory.annotation.*;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HobbyController {


    @Autowired
    private HobbyDao hobbyDao;


    @PostMapping("/createHobby")
    public HobbyEntity createHobby(@RequestBody HobbyEntity hobbyEntity) {
        return hobbyDao.saveHobby(hobbyEntity);
    }

    @GetMapping("/getHobbyById/{hobbyId}")
    public HobbyEntity getHobbyById(@PathVariable int hobbyId) {
        Optional<HobbyEntity> hobby = hobbyDao.getHobbyById(hobbyId);
        if (hobby.isPresent()) {
            return hobby.get();
        }
        return null;
    }

    @GetMapping("/getAllHobbies")
    public List<HobbyEntity> getAllHobbies() {
        return hobbyDao.getAllHobbies();
    }

    @DeleteMapping("/deleteHobbyById/{hobbyId}")
    public void deleteHobbyById(@PathVariable int hobbyId) {
        Optional<HobbyEntity> hobby = hobbyDao.getHobbyById(hobbyId);
        if (hobby.isPresent()) {
            hobbyDao.deleteHobbyById(hobbyId);
        }

    }

}
