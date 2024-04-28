package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.HobbyDTO;
import com.hewayah.hello_world.model.entity.Hobby;
import com.hewayah.hello_world.model.mapper.HobbyMapper;
import com.hewayah.hello_world.repository.HobbyRepository;
import com.hewayah.hello_world.service.HobbyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HobbyServiceImpl implements HobbyService {
    private final HobbyRepository hobbyRepository;
    private final HobbyMapper hobbyMapper;

    @Autowired
    public HobbyServiceImpl(HobbyRepository hobbyRepository, HobbyMapper hobbyMapper) {
        this.hobbyRepository = hobbyRepository;
        this.hobbyMapper = hobbyMapper;
    }

    @Override
    public HobbyDTO createHobby(HobbyDTO hobbyDTO) {
        Hobby hobby = hobbyMapper.toEntity(hobbyDTO);
        Hobby savedHobby = hobbyRepository.save(hobby);
        return hobbyMapper.toDTO(savedHobby);
    }

    @Override
    public HobbyDTO updateHobby(int id, HobbyDTO hobbyDTO) {
        Optional<Hobby> optionalHobby = hobbyRepository.findById(id);
        if (optionalHobby.isPresent()) {
            Hobby hobby = optionalHobby.get();
            hobby.setHobbyName(hobbyDTO.getHobbyName());
            hobby.setHobbyCategory(hobbyDTO.getHobbyCategory());
            hobby.setHobbyDescription(hobbyDTO.getHobbyDescription());

            Hobby updatedHobby = hobbyRepository.save(hobby);
            return hobbyMapper.toDTO(updatedHobby);
        } else {
            throw new IllegalArgumentException("Hobby not found with id: " + id);
        }
    }

    @Override
    public void deleteHobby(int id) {
        Optional<Hobby> optionalHobby = hobbyRepository.findById(id);
        if (optionalHobby.isPresent()) {
            hobbyRepository.delete(optionalHobby.get());
        } else {
            throw new IllegalArgumentException("Hobby not found with id: " + id);
        }
    }

    @Override
    public HobbyDTO getHobbyById(int id) {
        Optional<Hobby> optionalHobby = hobbyRepository.findById(id);
        if (optionalHobby.isPresent()) {
            Hobby hobby = optionalHobby.get();
            return hobbyMapper.toDTO(hobby);
        } else {
            throw new IllegalArgumentException("Hobby not found with id: " + id);
        }
    }

    @Override
    public List<HobbyDTO> getAllHobbies() {
        List<Hobby> hobbies = hobbyRepository.findAll();
        return hobbies.stream()
                .map(hobbyMapper::toDTO)
                .collect(Collectors.toList());
    }
}