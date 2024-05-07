//
//
//package com.hewayah.hello_world.service;
//
//import com.hewayah.hello_world.entity.Administrator;
//import com.hewayah.hello_world.repository.AdministratorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class AdministratorService {
//    private final AdministratorRepository administratorRepository;
//
//    @Autowired
//    public AdministratorService(AdministratorRepository administratorRepository) {
//        this.administratorRepository = administratorRepository;
//    }
//
//    public List<Administrator> getAllAdministrators() {
//        return administratorRepository.findAll();
//    }
//
//    public Optional<Administrator> getAdministratorById(Long administratorId) {
//        return administratorRepository.findById(administratorId);
//    }
//
//    public Administrator createAdministrator(Administrator administrator) {
//        return administratorRepository.save(administrator);
//    }
//
////    public void updateAdministrator(Long administratorId, Administrator updatedAdministrator) {
////        Optional<Administrator> existingAdministrator = administratorRepository.findById(administratorId);
////        existingAdministrator.ifPresent(administrator -> {
////            administrator.setAdminstratorUsername(updatedAdministrator.getAdminstratorUsername());
////            administrator.setPassword(updatedAdministrator.getPassword());
////            administrator.setEmail(updatedAdministrator.getEmail());
////            administrator.setPhoneNumber(updatedAdministrator.getPhoneNumber());
////            administrator.setFirstName(updatedAdministrator.getFirstName());
////            administrator.setLastName(updatedAdministrator.getLastName());
////            administratorRepository.save(administrator);
////        });
////    }
//
//    public void deleteAdministrator(Long administratorId) {
//        administratorRepository.deleteById(administratorId);
//    }
//}