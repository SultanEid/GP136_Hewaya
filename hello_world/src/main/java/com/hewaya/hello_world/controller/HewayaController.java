package com.hewaya.hello_world.controller;



import com.hewaya.hello_world.entity.Hobbyist;
import com.hewaya.hello_world.service.HobbyistService;
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
    public Hobbyist addOneHobbyist (@RequestBody Hobbyist hobbyist){
         return hobbyistService.saveHobbysit(hobbyist);
    }
    @PostMapping("/addHobbyists")
    public Hobbyist addHobbyists (@RequestBody List <Hobbyist> hobbyists){
        //here I add (Hobbyist)
        return (Hobbyist) hobbyistService.saveHobbysits(hobbyists);
    }


    @GetMapping("/Hobbyists")
    public List<Hobbyist> getHobbyist(){
        return hobbyistService.getHobbyists();
    }

    @GetMapping("/HobbyistsById/{id}")
    public Hobbyist findHobbyistById(@PathVariable int id){
        return hobbyistService.getHobbyistById(id);
    }

    @GetMapping("/HobbyistsByName/{name}")
    public Hobbyist findHobbyistById(@PathVariable String name){
        return hobbyistService.getHobbyistByName(name);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteHobbyist(@PathVariable int id){
        return hobbyistService.deleteHobbyist(id);
    }

    @PutMapping("/updateHobbyist")
    public Hobbyist updateHobbyistInform(Hobbyist hobbyist){
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
