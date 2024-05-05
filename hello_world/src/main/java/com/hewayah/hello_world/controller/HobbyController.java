package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.Hobby;
import com.hewayah.hello_world.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hobbies")
public class HobbyController {
    private final HobbyService hobbyService;

    @Autowired
    public HobbyController(HobbyService hobbyService) {
        this.hobbyService = hobbyService;
    }

    @GetMapping
    public ResponseEntity<List<Hobby>> getAllHobbies() {
        List<Hobby> hobbies = hobbyService.getAllHobbies();
        return ResponseEntity.ok(hobbies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hobby> getHobbyById(@PathVariable int id) {
        Optional<Hobby> hobby = hobbyService.getHobbyById(id);
        return hobby.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Hobby> createHobby(@Valid @RequestBody Hobby hobby) {
        Hobby createdHobby = hobbyService.createHobby(hobby);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHobby);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateHobby(@PathVariable int id, @Validated @RequestBody Hobby updatedHobby) {
        hobbyService.updateHobby(id, updatedHobby);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHobby(@PathVariable int id) {
        hobbyService.deleteHobby(id);
        return ResponseEntity.noContent().build();
    }
}