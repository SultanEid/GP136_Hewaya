package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Hobbyist;
import com.hewayah.hello_world.repository.HobbyistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyistService {
    private final HobbyistRepository hobbyistRepository;

    @Autowired
    public HobbyistService(HobbyistRepository hobbyistRepository) {
        this.hobbyistRepository = hobbyistRepository;
    }

    public List<Hobbyist> getAllHobbyists() {
        return hobbyistRepository.findAll();
    }

    public Optional<Hobbyist> getHobbyistById(Long hobbyistId) {
        return hobbyistRepository.findById(hobbyistId);
    }

    public Hobbyist createHobbyist(Hobbyist hobbyist) {
        return hobbyistRepository.save(hobbyist);
    }

    public void updateHobbyist(Long hobbyistId, Hobbyist updatedHobbyist) {
        Optional<Hobbyist> existingHobbyist = hobbyistRepository.findById(hobbyistId);
        existingHobbyist.ifPresent(hobbyist -> {
            hobbyist.setBirthDate(updatedHobbyist.getBirthDate());
            hobbyist.setUsername(updatedHobbyist.getUsername());
            hobbyist.setPassword(updatedHobbyist.getPassword());
            hobbyist.setEmail(updatedHobbyist.getEmail());
            hobbyist.setPhoneNumber(updatedHobbyist.getPhoneNumber());
            hobbyist.setName(updatedHobbyist.getName());
//            hobbyist.setLastName(updatedHobbyist.getLastName());
            hobbyistRepository.save(hobbyist);
        });
    }

    public void deleteHobbyist(Long hobbyistId) {
        hobbyistRepository.deleteById(hobbyistId);

    }
}