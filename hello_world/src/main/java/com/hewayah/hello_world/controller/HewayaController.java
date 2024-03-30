package com.hewayah.hello_world.controller;



import com.hewayah.hello_world.entity.HobbyistEntity;
import com.hewayah.hello_world.service.HobbyistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//
//@Controller
@RestController
public class HewayaController {

    @Autowired
    private HobbyistService hobbyistService;


    @PostMapping("/addHobbyist")
    public HobbyistEntity addOneHobbyist (@RequestBody HobbyistEntity hobbyist){
        return hobbyistService.saveHobbysit(hobbyist);
    }
    //here I think it list
    @PostMapping("/addHobbyists")
    public HobbyistEntity addHobbyists (@RequestBody List <HobbyistEntity> hobbyists){
        return (HobbyistEntity) hobbyistService.saveHobbysits(hobbyists);
    }

    @GetMapping("/Hobbyists")
    public List<HobbyistEntity> getHobbyist(){
        return hobbyistService.getHobbyists();
    }

    @GetMapping("/HobbyistsById/{id}")
    public HobbyistEntity findHobbyistById(@PathVariable int id){
        return hobbyistService.getHobbyistById(id);
    }

    @GetMapping("/HobbyistsByUsername/{username}")
    public HobbyistEntity findHobbyistByUsername(@PathVariable String username){
        return hobbyistService.getHobbyistByUsername(username);
    }

    @GetMapping("/checkUsername/{username}")
    public boolean checkUsername(@PathVariable String username){
        return hobbyistService.isUsernameExists(username);
    }
    @GetMapping("/checkEmail/{email}")
    public boolean checkEmail(@PathVariable String email){
        return hobbyistService.isEmailExists(email);
    }
//    @GetMapping("/checkPassword/{password}")
//    public boolean checkEmailAndPassword(@PathVariable String password){
//        return hobbyistService.isVaildInoform(password);
//    }




    @DeleteMapping("/delete/{id}")
    public String deleteHobbyist(@PathVariable int id){
        return hobbyistService.deleteHobbyist(id);
    }

    @PutMapping("/updateHobbyist")
    public HobbyistEntity updateHobbyistInform(@RequestBody HobbyistEntity hobbyist){
    return hobbyistService.updateHobbyistInform(hobbyist);
    }




















    //object from HewayaService
//    @Autowired
//    UserRepo userRepo;
//    HewayaService hewayaService;





//    @GetMapping("/")
//    public String index(){
//        return "HewayahLogin";
//    }
////
//    @GetMapping("/login")
//    public String User(@ModelAttribute Hobbyist hobbyist, String errorMessage,Model model){
//        errorMessage = "Username or Password is incorrect";
//        if(hobbyist.getUserName().equals("Zidn") && hobbyist.getPassword().equals("1234")){
//            model.addAttribute("userName", hobbyist.getUserName());
////            model.addAttribute("errorMessage", errorMessage);
//            return "welcome";
//        }
//        else{
//            model.addAttribute("errorMessage" , errorMessage);
//               return "HewayahLogin";
//        }
//    }








//    @RequestMapping (value= "Login")
//    @ResponseBody
//    public String user(String username, String psw){
//        String result;
//        if(psw.equals("123")){
//            return result = "welcome back " + username;
//        }
//        else{
//            return result = "wrong password ";
//        }
//
//    }

}
