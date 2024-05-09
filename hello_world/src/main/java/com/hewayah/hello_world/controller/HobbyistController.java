package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.entity.Hobbyist;
import com.hewayah.hello_world.service.HobbyistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
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

    @GetMapping
    public ResponseEntity<List<Hobbyist>> getAllHobbyists() {
        List<Hobbyist> hobbyists = hobbyistService.getAllHobbyists();
        return ResponseEntity.ok(hobbyists);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hobbyist> getHobbyistById(@PathVariable Long id) {
        Optional<Hobbyist> hobbyist = hobbyistService.getHobbyistById(id);
        return hobbyist.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Hobbyist> createHobbyist(@Valid @RequestBody Hobbyist hobbyist) {
        Hobbyist createdHobbyist = hobbyistService.createHobbyist(hobbyist);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHobbyist);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateHobbyist(@PathVariable Long id, @Validated @RequestBody Hobbyist updatedHobbyist) {
        hobbyistService.updateHobbyist(id, updatedHobbyist);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHobbyist(@PathVariable Long id) {
        hobbyistService.deleteHobbyist(id);
        return ResponseEntity.noContent().build();
    }
}