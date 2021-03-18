package org.example.controller;


import org.example.Dao.UserDao;
import org.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {
 /*
   @Autowired
    private UserDao userDao;

    @RequestMapping("/register")
    public String registrationForm(Model model){

        Users users = new Users();
        model.addAllAttributes("users",users);
        return "register";

    }
    @RequestMapping("/processForm")
    public String processFrom(@ModelAttribute("users") Users users) {

        userDao.createUser(users);

        return "redirect:/";
    }*/
}
