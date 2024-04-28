package com.hewayah.hello_world.service;

import com.hewayah.hello_world.model.dto.HobbyDTO;

import java.util.List;

public interface HobbyService {
    HobbyDTO createHobby(HobbyDTO hobbyDTO);
    HobbyDTO updateHobby(int id, HobbyDTO hobbyDTO);
    void deleteHobby(int id);
    HobbyDTO getHobbyById(int id);
    List<HobbyDTO> getAllHobbies();
}