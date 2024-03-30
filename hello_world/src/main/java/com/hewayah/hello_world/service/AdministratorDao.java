package com.hewayah.hello_world.service;
import com.hewayah.hello_world.entity.AdministratorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hewayah.hello_world.repository.AdministratorRepo;

import java.util.List;
import java.util.Optional;
@Service
public class AdministratorDao {
    @Autowired
    private AdministratorRepo administratorRepo ;

    public List<AdministratorEntity> getAllAdministrators() {
        return this.administratorRepo.findAll();
    }

    public Optional<AdministratorEntity> getAdministratorByUsername(String username) {
        return administratorRepo.findById(username);
    }
    public AdministratorEntity createAdministrator(AdministratorEntity administrator) {
        return this.administratorRepo.save(administrator);
    }

    public void deleteAdministrator( String username){
        this.administratorRepo.deleteById(username);
    }
}
