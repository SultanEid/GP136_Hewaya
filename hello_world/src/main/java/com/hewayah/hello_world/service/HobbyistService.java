package com.hewayah.hello_world.service;

import com.hewayah.hello_world.repository.HobbyistRepo;
import com.hewayah.hello_world.entity.HobbyistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class HobbyistService {

    @Autowired
    private HobbyistRepo hobbyistRepo;
    //here you can create one hobbyist
    public HobbyistEntity saveHobbysit(HobbyistEntity hobbyist){
        return hobbyistRepo.save(hobbyist);
    }
    //here you can create more than one hobbyist
    public List<HobbyistEntity> saveHobbysits (List<HobbyistEntity> hobbyists){
        return hobbyistRepo.saveAll(hobbyists);
    }
    //here you can get all the hobbyist in DB
    public List<HobbyistEntity> getHobbyists(){
        return hobbyistRepo.findAll();
    }

    //search about hobbyist using his Id number
    public HobbyistEntity getHobbyistById (int id){
        return hobbyistRepo.findById(id).orElse(null);
    }
    public HobbyistEntity getHobbyistByUsername (String username){
        return hobbyistRepo.findByUsername(username);
    }
    //to check if the username was in DB then display error message
    public boolean isUsernameExists(String username){
        HobbyistEntity hobbyist = hobbyistRepo.findByUsername(username);
        return hobbyist!=null;
    }
    //to check if the email was in DB then display error message
    public boolean isEmailExists(String email){
        HobbyistEntity hobbyist = hobbyistRepo.findByEmail(email);
        return hobbyist!=null;
    }
    //here to check eamil with password if the password equal the same password
    // in database then return true if not return false
    public boolean isVaildInoform(String email, String password){
        HobbyistEntity hobbyist = hobbyistRepo.findByEmail(email);
        if(hobbyist !=null &hobbyist.getPassword().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
    //delete user using his id number
    public String deleteHobbyist(int id){
        hobbyistRepo.deleteById(id);
        return "hobbyist removed!! " + id;
    }
    //here you can update user information
    public HobbyistEntity updateHobbyistInform(HobbyistEntity hobbyist){
        HobbyistEntity existingHobbyist = hobbyistRepo.findById(hobbyist.getUser_id()).orElse(null);
        existingHobbyist.setName(hobbyist.getName());
        existingHobbyist.setEmail(hobbyist.getEmail());
        existingHobbyist.setUsername(hobbyist.getUsername());
        existingHobbyist.setPassword(hobbyist.getPassword());
        return hobbyistRepo.save(existingHobbyist);
    }
}
