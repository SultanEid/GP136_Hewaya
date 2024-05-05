package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Hobby;
import com.hewayah.hello_world.repository.HobbyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyService {
    private final HobbyRepository hobbyRepository;

    @Autowired
    public HobbyService(HobbyRepository hobbyRepository) {
        this.hobbyRepository = hobbyRepository;
    }

    public List<Hobby> getAllHobbies() {
        return hobbyRepository.findAll();
    }

    public Optional<Hobby> getHobbyById(int hobbyId) {
        return hobbyRepository.findById(hobbyId);
    }

    public Hobby createHobby(Hobby hobby) {
        return hobbyRepository.save(hobby);
    }

    public void updateHobby(int hobbyId, Hobby updatedHobby) {
        Optional<Hobby> existingHobby = hobbyRepository.findById(hobbyId);
        existingHobby.ifPresent(hobby -> {
            hobby.setHobbyName(updatedHobby.getHobbyName());
            hobby.setHobbyCategory(updatedHobby.getHobbyCategory());
            hobby.setHobbyDescription(updatedHobby.getHobbyDescription());
            hobbyRepository.save(hobby);
        });
    }

    public void deleteHobby(int hobbyId) {
        hobbyRepository.deleteById(hobbyId);
    }
}