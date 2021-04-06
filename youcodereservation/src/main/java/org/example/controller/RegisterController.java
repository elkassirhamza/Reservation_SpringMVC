package org.example.controller;


import java.util.List;

import org.example.Dao.ApprenantDao;
import org.example.Dao.ApprenantDaoImpl;
import org.example.Dao.UserDaoImpl;

import org.example.model.Apprenant;
import org.example.model.Roles;
import org.example.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller

public class RegisterController {

    @Autowired
    private UserDaoImpl userDaoImpl;


    //@Autowired
    private ApprenantDao userDao = new ApprenantDaoImpl();

    //controller method to show the registration form

    /*@RequestMapping(value = "/Register", method = RequestMethod.GET )
    public String register(Model theModel) {

        Users users = new Users();
        Roles roles = new Roles();
        roles.setIdRole(2L);
        users.setIdUsers(2L);
        // if registered redirect the user to home
        // else continue
        theModel.addAttribute("users", users);
        System.out.println(users);
        return "register";
    }*/

    //controller method to process the registration form
    @RequestMapping(value ="/Register", method = RequestMethod.POST)
    public String Register(@ModelAttribute("users") Apprenant users, Model model) {
        //UserDao userDao = new UserDaoImpl();
        Roles role=new Roles();
        role.setIdRole(2L);
        users.setRoles(role);
        users.setStatus(false);
        userDao.createApprenant(users);
        System.out.println("register done");
        model.addAttribute("msg", "you have registered successfully ");
        return "register";
    }

    @RequestMapping(value = "/RegisterRequest", method = RequestMethod.GET)
    public String Requestt(Model model){
        List<Users> list =userDaoImpl.getAllUsers();
        model.addAttribute("list", list);
        return "RegisterRequest";
    }

    @RequestMapping(value = "/approuve", method = RequestMethod.POST)
    public String approuve(HttpServletRequest request){
        Long id = Long.valueOf(request.getParameter("id"));
        Users users = userDaoImpl.getUserById(id);
        users.setStatus(true);
        userDaoImpl.updateUser(users);
        System.out.println("ohiugi");
        return "redirect:/RegisterRequest";
    }

}