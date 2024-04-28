package com.hewayah.hello_world.controller;

import com.hewayah.hello_world.model.dto.HobbyistDTO;
import com.hewayah.hello_world.service.HobbyistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hobbyists")
public class HobbyistController {
    private final HobbyistService hobbyistService;

    @Autowired
    public HobbyistController(HobbyistService hobbyistService) {
        this.hobbyistService = hobbyistService;
    }

    @PostMapping
    public ResponseEntity<HobbyistDTO> createHobbyist(@Validated @RequestBody HobbyistDTO hobbyistDTO) {
        HobbyistDTO createdHobbyist = hobbyistService.createHobbyist(hobbyistDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHobbyist);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HobbyistDTO> updateHobbyist(
            @PathVariable Long id,
            @Validated @RequestBody HobbyistDTO hobbyistDTO
    ) {
        HobbyistDTO updatedHobbyist = hobbyistService.updateHobbyist(id, hobbyistDTO);
        return ResponseEntity.ok(updatedHobbyist);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHobbyist(@PathVariable Long id) {
        hobbyistService.deleteHobbyist(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<HobbyistDTO> getHobbyistById(@PathVariable Long id) {
        HobbyistDTO hobbyistDTO = hobbyistService.getHobbyistById(id);
        return ResponseEntity.ok(hobbyistDTO);
    }

    @GetMapping
    public ResponseEntity<List<HobbyistDTO>> getAllHobbyists() {
        List<HobbyistDTO> hobbyistDTOList = hobbyistService.getAllHobbyists();
        return ResponseEntity.ok(hobbyistDTOList);
    }
}