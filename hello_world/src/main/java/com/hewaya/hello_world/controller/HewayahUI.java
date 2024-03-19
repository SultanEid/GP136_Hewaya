package com.hewaya.hello_world.controller;

import com.hewaya.hello_world.entity.HobbyistEntity;
import com.hewaya.hello_world.service.HobbyistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


//this class deal with html page and treat directly with HewayaController to use the method CRUD
@Controller
public class HewayahUI {

        @Autowired
        private HewayaController hewayaController;
        @Autowired
        private HobbyistService hobbyistService;
        //to display signup page
        @GetMapping("/signup")
        public String index() {
            return "signup";
        }
        //here to save user data if the username and email not in the database
        // then store it in DB if not then display error messsage
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

        //here to display login page with GetMapping
        @GetMapping("/login")
        public String loginPage() {
            return "login";
        }
        //here to send email and password to check if true then go to home page
        // if not then remain in login page and display message
        @PostMapping("/login")
        public String loginSubmit(@ModelAttribute HobbyistEntity hobbyist, Model model) {
            boolean validInform = hobbyistService.isVaildInoform(hobbyist.getEmail(), hobbyist.getPassword());

            if (validInform) {
                return "home";
            } else {
                model.addAttribute("emailAndPassword", "email or password incorrect!");
                return "login";
            }
        }

    }