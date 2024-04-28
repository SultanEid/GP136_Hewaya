package com.hewayah.hello_world.service.ServiceImpl;

import com.hewayah.hello_world.model.dto.HobbyistDTO;
import com.hewayah.hello_world.model.entity.Hobbyist;
import com.hewayah.hello_world.model.mapper.HobbyistMapper;
import com.hewayah.hello_world.repository.HobbyistRepository;
import com.hewayah.hello_world.service.HobbyistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HobbyistServiceImpl implements HobbyistService {
    private final HobbyistRepository hobbyistRepository;
    private final HobbyistMapper hobbyistMapper;

    @Autowired
    public HobbyistServiceImpl(HobbyistRepository hobbyistRepository, HobbyistMapper hobbyistMapper) {
        this.hobbyistRepository = hobbyistRepository;
        this.hobbyistMapper = hobbyistMapper;
    }

    @Override
    public HobbyistDTO createHobbyist(HobbyistDTO hobbyistDTO) {
        Hobbyist hobbyist = hobbyistMapper.toEntity(hobbyistDTO);
        Hobbyist savedHobbyist = hobbyistRepository.save(hobbyist);
        return hobbyistMapper.toDTO(savedHobbyist);
    }

    @Override
    public HobbyistDTO updateHobbyist(Long id, HobbyistDTO hobbyistDTO) {
        return null;
    }

    /*
    @Override
    public HobbyistDTO updateHobbyist(Long id, HobbyistDTO hobbyistDTO) {
        Optional<Hobbyist> optionalHobbyist = hobbyistRepository.findById(id);
        if (optionalHobbyist.isPresent()) {
            Hobbyist hobbyist = optionalHobbyist.get();
            hobbyist.setBirthDate(hobbyistDTO.getBirthDate());
            hobbyist.setHobbyistUsername(hobbyistDTO.getHobbyistUsername());
            hobbyist.setPassword(hobbyistSure! Here's the remaining part of the `HobbyistServiceImpl` class:

```java
            hobbyist.setEmail(hobbyistDTO.getEmail());
            hobbyist.setDateUpdate(hobbyistDTO.getUpdatedAt());
            hobbyist.setPhoneNumber(hobbyistDTO.getPhoneNumber());
            hobbyist.setFirstName(hobbyistDTO.getFirstName());
            hobbyist.setLastName(hobbyistDTO.getLastName());

            Hobbyist updatedHobbyist = hobbyistRepository.save(hobbyist);
            return hobbyistMapper.toDTO(updatedHobbyist);
        } else {
            throw new IllegalArgumentException("Hobbyist not found with id: " + id);
        }
    }


     */
    @Override
    public void deleteHobbyist(Long id) {
        Optional<Hobbyist> optionalHobbyist = hobbyistRepository.findById(id);
        if (optionalHobbyist.isPresent()) {
            hobbyistRepository.delete(optionalHobbyist.get());
        } else {
            throw new IllegalArgumentException("Hobbyist not found with id: " + id);
        }
    }

    @Override
    public HobbyistDTO getHobbyistById(Long id) {
        Optional<Hobbyist> optionalHobbyist = hobbyistRepository.findById(id);
        if (optionalHobbyist.isPresent()) {
            Hobbyist hobbyist = optionalHobbyist.get();
            return hobbyistMapper.toDTO(hobbyist);
        } else {
            throw new IllegalArgumentException("Hobbyist not found with id: " + id);
        }
    }

    @Override
    public List<HobbyistDTO> getAllHobbyists() {
        List<Hobbyist> hobbyists = hobbyistRepository.findAll();
        return hobbyists.stream()
                .map(hobbyistMapper::toDTO)
                .collect(Collectors.toList());
    }
}