package com.hewaya.hello_world.service;

import com.hewaya.hello_world.repository.HobbyistRepo;
import com.hewaya.hello_world.entity.HobbyistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class HobbyistService {

    @Autowired
    private HobbyistRepo hobbyistRepo;

    public HobbyistEntity saveHobbysit(HobbyistEntity hobbyist){
        return hobbyistRepo.save(hobbyist);
    }

    public List<HobbyistEntity> saveHobbysits (List<HobbyistEntity> hobbyists){
        return hobbyistRepo.saveAll(hobbyists);
    }

    public List<HobbyistEntity> getHobbyists(){
        return hobbyistRepo.findAll();
    }


    public HobbyistEntity getHobbyistById (int id){
        return hobbyistRepo.findById(id).orElse(null);
    }
    public HobbyistEntity getHobbyistByUsername (String username){
        return hobbyistRepo.findByUsername(username);
    }

    public boolean isUsernameExists(String username){
        HobbyistEntity hobbyist = hobbyistRepo.findByUsername(username);
        return hobbyist!=null;
    }
    public boolean isEmailExists(String email){
        HobbyistEntity hobbyist = hobbyistRepo.findByEmail(email);
        return hobbyist!=null;
    }
    public boolean isPasswordExists(String password){
        HobbyistEntity hobbyist = hobbyistRepo.findByPassword(password);
        return hobbyist!=null;
    }

    public String deleteHobbyist(int id){
        hobbyistRepo.deleteById(id);
        return "hobbyist removed!! " + id;
    }
    public HobbyistEntity updateHobbyistInform(HobbyistEntity hobbyist){
        HobbyistEntity existingHobbyist = hobbyistRepo.findById(hobbyist.getUser_id()).orElse(null);
        existingHobbyist.setName(hobbyist.getName());
        existingHobbyist.setEmail(hobbyist.getEmail());
        existingHobbyist.setUsername(hobbyist.getUsername());
        existingHobbyist.setPassword(hobbyist.getPassword());
        return hobbyistRepo.save(existingHobbyist);
    }
}
