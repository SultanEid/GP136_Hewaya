//package com.hewayah.hello_world.config;
//
//import com.hewayah.hello_world.service.ServiceProviderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.*;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurationAdapter {
//
//    @Autowired
////    private Cus
////    private CustomUserDetailsService customUserDetailsService;
//    @Override
//    protected void configure (AuthenticationManagerBuilder auth) throws Exception{
//        auth.userDetailsService().passwordEncoder(passwordEncoder());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    // Other configuration beans and methods
//}