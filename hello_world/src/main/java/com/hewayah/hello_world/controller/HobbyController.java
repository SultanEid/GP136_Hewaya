package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.model.dto.HobbyDTO;
import com.hewayah.hello_world.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hobbies")
public class HobbyController {
    private final HobbyService hobbyService;

    @Autowired
    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    @PostMapping
    public ResponseEntity<HobbyDTO> createHobby(@RequestBody HobbyDTO hobbyDTO) {
        HobbyDTO createdHobby = hobbyService.createHobby(hobbyDTO);
        return new ResponseEntity<>(createdHobby, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HobbyDTO> updateHobby(@PathVariable int id, @RequestBody HobbyDTO hobbyDTO) {
        HobbyDTO updatedHobby = hobbyService.updateHobby(id, hobbyDTO);
        return new ResponseEntity<>(updatedHobby, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHobby(@PathVariable int id) {
        hobbyService.deleteHobby(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HobbyDTO> getHobbyById(@PathVariable int id) {
        HobbyDTO hobby = hobbyService.getHobbyById(id);
        return new ResponseEntity<>(hobby, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<HobbyDTO>> getAllHobbies() {
        List<HobbyDTO> hobbies = hobbyService.getAllHobbies();
        return new ResponseEntity<>(hobbies, HttpStatus.OK);
    }
}