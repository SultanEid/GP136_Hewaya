package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.HobbyistDTO;

import java.util.List;

public interface HobbyistService {
    HobbyistDTO createHobbyist(HobbyistDTO hobbyistDTO);
    HobbyistDTO updateHobbyist(Long id, HobbyistDTO hobbyistDTO);
    void deleteHobbyist(Long id);
    HobbyistDTO getHobbyistById(Long id);
    List<HobbyistDTO> getAllHobbyists();
}