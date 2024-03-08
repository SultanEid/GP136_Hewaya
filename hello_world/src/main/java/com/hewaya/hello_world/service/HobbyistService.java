package com.hewaya.hello_world.service;

import com.hewaya.hello_world.repository.HobbyistRepo;
import com.hewaya.hello_world.entity.Hobbyist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class HobbyistService {

    @Autowired
    private HobbyistRepo hobbyistRepo;

    public Hobbyist saveHobbysit(Hobbyist hobbyist){
        return hobbyistRepo.save(hobbyist);
    }

    public List<Hobbyist> saveHobbysits (List<Hobbyist> hobbyists){
        return hobbyistRepo.saveAll(hobbyists);
    }

    public List<Hobbyist> getHobbyists(){
        return hobbyistRepo.findAll();
    }


    public Hobbyist getHobbyistById (int id){
        return hobbyistRepo.findById(id).orElse(null);
    }
    public Hobbyist getHobbyistByName (String name){
        return hobbyistRepo.findByName(name);
    }

    public String deleteHobbyist(int id){
        hobbyistRepo.deleteById(id);
        return "hobbyist removed!! " + id;
    }
    public Hobbyist updateHobbyistInform(Hobbyist hobbyist){
        Hobbyist existingHobbyist = hobbyistRepo.findById(hobbyist.getUser_id()).orElse(null);
        existingHobbyist.setName(hobbyist.getName());
        existingHobbyist.setEmail(hobbyist.getEmail());
        existingHobbyist.setUsername(hobbyist.getUsername());
        existingHobbyist.setPassword(hobbyist.getPassword());
        return hobbyistRepo.save(existingHobbyist);
    }
}
