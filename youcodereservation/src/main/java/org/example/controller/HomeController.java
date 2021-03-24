package org.example.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

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
	/*@RequestMapping("/register")
	public String register() {
		return "register";
	}*/
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}

		@RequestMapping("/checking")
	public String test1() {
		return "checking";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";

	}
}
