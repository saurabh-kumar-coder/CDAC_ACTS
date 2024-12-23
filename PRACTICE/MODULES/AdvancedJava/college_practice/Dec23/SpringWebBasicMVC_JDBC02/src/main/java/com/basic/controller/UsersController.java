package com.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.basic.beans.Users;
import com.basic.dao.UserDao;

import jakarta.servlet.http.HttpSession;

@Controller
public class UsersController {
	
	@Autowired
	UserDao userDao;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping("/home")
	public ModelAndView welcome() {
		return new ModelAndView("home");
	}
	
	@RequestMapping("/login")
	public void prepareController(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}
	
	@RequestMapping("/newUser")
	public void prepareNewUser(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}
	
	@RequestMapping("/register")
	public String registerUser(@ModelAttribute("objUser") Users objUser) {
		userDao.registerUser(objUser.getUserName(), objUser.getPassword(), objUser.getMobile(), objUser.getFirstName(), objUser.getLastName(), objUser.getEmail());
		return "success";
	}
	
	
	@RequestMapping("/authenticate")
	public ModelAndView validateUser(@ModelAttribute("objUser") Users user) {
		Users dbUser = userDao.getUserDetails(user.getUserName());
		if(user.getUserName().equals(dbUser.getUserName()) && user.getPassword().equals(dbUser.getPassword())) {
			return new ModelAndView("welcome", "data", "Hi " + user.getUserName() + "to the online shopping app");
		} else {
			return new ModelAndView("failure", "message", "Invalid Authentication");
		}
	}
	
}
