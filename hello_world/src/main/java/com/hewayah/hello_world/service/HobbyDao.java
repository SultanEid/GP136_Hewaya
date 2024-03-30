package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.HobbyEntity;
import com.hewayah.hello_world.repository.hobbyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyDao {


    @Autowired
    private hobbyRepo hobbyRepo;

    public HobbyEntity saveHobby(HobbyEntity hobbyEntity) {
        return hobbyRepo.save(hobbyEntity);
    }

    public Optional<HobbyEntity> getHobbyById(int hobbyId) {
        return hobbyRepo.findById(hobbyId);
    }

    public List<HobbyEntity> getAllHobbies() {
        return hobbyRepo.findAll();
    }

    public void deleteHobbyById(int hobbyId) {
        hobbyRepo.deleteById(hobbyId);
    }
}
