package org.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.example.model.Users;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired

	@Qualifier("UserService")

	private UserService userService;

	User user;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/home1")
	public ModelAndView test3(HttpServletResponse response) throws IOException{
		return new ModelAndView("home1");
	}
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

		@RequestMapping("/checking")
	public String test1() {
		return "checking";
	}

	@RequestMapping("/reservation1")
	public String loadReserv  () {

		return "reservation1";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";

	}

	@RequestMapping("/register1")
	public String Register1(HttpServletResponse response) throws IOException{
		return "register1";
	}
}
