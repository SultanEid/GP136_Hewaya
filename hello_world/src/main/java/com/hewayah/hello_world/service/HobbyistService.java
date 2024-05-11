package com.hewayah.hello_world.service;

import com.hewayah.hello_world.entity.Hobbyist;
import com.hewayah.hello_world.repository.HobbyistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HobbyistService {
//
//    private final HobbyistRepository hobbyistRepository;
//
//    @Autowired
//    public HobbyistService(HobbyistRepository hobbyistRepository) {
//        this.hobbyistRepository = hobbyistRepository;
//    }
//
//    public Optional<Hobbyist> getHobbyistById(Long id) {
//        return hobbyistRepository.findById(id);
//    }
//
//    public List<Hobbyist> getAllHobbyists() {
//        return hobbyistRepository.findAll();
//    }
//
//    public Hobbyist createHobbyist(Hobbyist hobbyist) {
//        return hobbyistRepository.save(hobbyist);
//    }
//
//    public Hobbyist updateHobbyist(Long id, Hobbyist updatedHobbyist) {
//        Optional<Hobbyist> existingHobbyist = hobbyistRepository.findById(id);
//        if (existingHobbyist.isPresent()) {
//            Hobbyist hobbyist = existingHobbyist.get();
//            hobbyist.setUsername(updatedHobbyist.getUsername());
//            hobbyist.setPassword(updatedHobbyist.getPassword());
//            hobbyist.setEmail(updatedHobbyist.getEmail());
//            hobbyist.setPhoneNumber(updatedHobbyist.getPhoneNumber());
//            hobbyist.setUserType(updatedHobbyist.getUserType());
//            hobbyist.setName(updatedHobbyist.getName());
//            hobbyist.setBio(updatedHobbyist.getBio());
//            hobbyist.setGender(updatedHobbyist.getGender());
//            hobbyist.setBirthDate(updatedHobbyist.getBirthDate());
//            // Update additional fields specific to Hobbyist entity
//
//            return hobbyistRepository.save(hobbyist);
//        } else {
//            throw new IllegalArgumentException("Hobbyist with ID " + id + " not found");
//        }
//    }
//
//    public void deleteHobbyist(Long id) {
//        hobbyistRepository.deleteById(id);
//    }
}