package org.example.controller;


import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.Dao.UserDao;
import org.example.Dao.UserDaoImpl;

import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class RegisterController {


    @Autowired
    private UserDao userDao = new UserDaoImpl();

    //controller method to show the registration form

    @RequestMapping(value = "/Register", method = RequestMethod.GET )
    public String register(Model theModel) {

        Users users = new Users();
        // if registered redirect the user to home
        // else continue
        theModel.addAttribute("users", users);
        System.out.println(users);
        return "register";
    }

    //controller method to process the registration form
    @RequestMapping(value ="/Register", method = RequestMethod.POST)
    public String Register(@ModelAttribute("users") Users users) {
        //UserDao userDao = new UserDaoImpl();
        userDao.createUser(users);
        System.out.println("register done");
        return "redirect:/login";
    }

}