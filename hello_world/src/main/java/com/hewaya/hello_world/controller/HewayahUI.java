package com.hewaya.hello_world.controller;

import com.hewaya.hello_world.entity.HobbyistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HewayahUI {

        @Autowired
        private HewayaController hewayaController;

        @GetMapping("/signup")
        public String index() {
            return "signup";
        }

        @PostMapping ("/signup")
        public String signUp(@ModelAttribute HobbyistEntity hobbyist, Model model) {


            if (hobbyist.getPassword().length() > 7 && hewayaController.checkUsername(hobbyist.getUsername()) !=true) {
                hewayaController.addOneHobbyist(hobbyist);
                model.addAttribute("username", hobbyist.getName());
                return "home";
            } else if(hobbyist.getPassword().length() < 7 ){
                model.addAttribute("passwordErrorMessage", "Password must be above 7 characters");
                return "signup";
            }
            else if(hewayaController.checkUsername(hobbyist.getUsername()) ==true){
                model.addAttribute("usernameErrorMessage", "username is used by someone");
                return "signup";
            }
            else if(hewayaController.checkEmail(hobbyist.getEmail()) == true){
                model.addAttribute("emailErrorMessage", "email is used by someone");
                return "signup";
            }
            else{
                model.addAttribute("usernameAndPassowordErrorMessage", "username is used by someone and password must be above 7 charas");
                return "signup";
            }
        }


        @GetMapping("/login")
        public String login(@ModelAttribute HobbyistEntity hobbyist, Model model) {

            if(hewayaController.checkEmail(hobbyist.getEmail()) ==false || hewayaController.checkPassword(hobbyist.getPassword()) ==false){
                model.addAttribute("usernameANDpassword", "username or password inccorrct!");
                return "login";
            }
            else{
                return "home";
            }
        }




    }