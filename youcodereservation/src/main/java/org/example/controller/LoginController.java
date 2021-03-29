package org.example.controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.model.Roles;
import org.example.model.Users;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @Autowired

    @Qualifier("UserService")
    private UserService userService;

    Users user;
    Roles role;

    @RequestMapping(value = "/Login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response,Model model) throws SQLException, ClassNotFoundException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println(email);
        System.out.println(password);

        if (userService.validate(email, password) == "admin") {

            System.out.println("login successful");
            return "redirect:/reservation";
        } if (userService.validate(email, password) == "apprenant") {
            user =userService.getByEmail(email);

            String name = user.getNom();
            /*String prenom = user.getPrenom();*/
            model.addAttribute("model",name);
            //model.addAttribute("model",prenom);
            System.out.println("login successful");
            return "redirect:/reservform";
        }else {
            return "redirect:/login";
        }
    }

}