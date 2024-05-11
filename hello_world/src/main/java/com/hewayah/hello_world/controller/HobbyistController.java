package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.Hobbyist;
import com.hewayah.hello_world.entity.User;
import com.hewayah.hello_world.service.HobbyistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hobbyists")
public class HobbyistController {

    private final HobbyistService hobbyistService;

    @Autowired
    public HobbyistController(HobbyistService hobbyistService) {
        this.hobbyistService = hobbyistService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getHobbyistById(@PathVariable Long id) {
        Optional<User> hobbyist = hobbyistService.getHobbyistById(id);
        return hobbyist.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllHobbyists() {
        List<User> hobbyists = hobbyistService.getAllHobbyists();
        return ResponseEntity.ok(hobbyists);
    }

    @PostMapping
    public ResponseEntity<Hobbyist> createHobbyist(@RequestBody @Valid Hobbyist hobbyist) {
        Hobbyist createdHobbyist = hobbyistService.createHobbyist(hobbyist);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHobbyist);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Hobbyist> updateHobbyist(@PathVariable Long id, @RequestBody @Valid Hobbyist hobbyist) {
        Hobbyist updatedHobbyist = hobbyistService.updateHobbyist(id, hobbyist);
        return ResponseEntity.ok(updatedHobbyist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHobbyist(@PathVariable Long id) {
        hobbyistService.deleteHobbyist(id);
        return ResponseEntity.noContent().build();
    }
}