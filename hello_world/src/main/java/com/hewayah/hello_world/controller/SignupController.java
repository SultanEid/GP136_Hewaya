//package com.hewayah.hello_world.controller;
//
//
//import com.hewayah.hello_world.entity.ServiceProvider;
//import com.hewayah.hello_world.repository.ServiceProviderRepository;
//import com.hewayah.hello_world.service.ServiceProviderService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class SignupController {
//
//
//    @Autowired
//    private ServiceProviderRepository serviceProviderRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @PostMapping("/signup")
//    public ServiceProvider signup(@RequestBody ServiceProviderService serviceProviderService ){
//        ServiceProvider serviceProvider = new ServiceProvider();
//        serviceProvider.setPassword(passwordEncoder.encode(serviceProvider.getPassword()));
//        return serviceProviderRepository.save(serviceProvider);
//
//    }
////
////    @Autowired
////    private final ServiceProviderRepository serviceProviderRepository;
//////    @Autowired
////    private final PasswordEncoder passwordEncoder;
////
////    public SignupController(ServiceProviderRepository serviceProviderRepository, PasswordEncoder passwordEncoder) {
////        this.serviceProviderRepository = serviceProviderRepository;
////        this.passwordEncoder = passwordEncoder;
////    }
////
////    @PostMapping("/signup")
////    public String signup(@RequestBody ServiceProvider serviceProvider) {
////        if (serviceProviderRepository.findByUsername(serviceProvider.getServiceProviderUsername()) != null) {
////            return "Username already exists";
////        }
////
////        String encodedPassword = passwordEncoder.encode(serviceProvider.getPassword());
////
////        ServiceProvider serviceProviderUser = new ServiceProvider();
////        serviceProviderUser.setServiceProviderUsername(serviceProviderUser.getServiceProviderUsername());
////        serviceProviderUser.setPassword(encodedPassword);
////        // Set other user properties
////
////        serviceProviderRepository.save(serviceProviderUser);
////
////        return "Signup successful!";
////    }
//}
