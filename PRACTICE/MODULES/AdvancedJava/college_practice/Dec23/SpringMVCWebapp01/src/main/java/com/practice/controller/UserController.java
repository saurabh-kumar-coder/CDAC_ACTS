package com.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.practice.pojos.Users;

@Controller
public class UserController {

//	@RequestMapping("/home")
	@GetMapping("/home")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@GetMapping("/login")
	public void login(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}

	@RequestMapping("/authenticate")
	public ModelAndView auth(Users objUser) {
		if (objUser.getUserName().equals("ram") && objUser.getPassword().equals("ram")) {
			return new ModelAndView("success");
		}
		return new ModelAndView("failure");
	}

	@GetMapping("/register")
	public void register(@ModelAttribute("objUser") Users user) {
		System.out.println(user.toString());
	}

	@RequestMapping("/reguser")
	public ModelAndView registerUser(@ModelAttribute("objUser") Users objUser) {
		System.out.println("ObjUser : " + objUser);
		if ((objUser.getUserName().equals(null) || objUser.getUserName() == "")
				&& (objUser.getPassword().equals(null) || objUser.getPassword() == "") && objUser.getMobile() == 0
				&& (objUser.getFirstName().equals(null) || objUser.getFirstName() == "")
				&& (objUser.getLastName().equals(null) || objUser.getLastName() == "")
				&& (objUser.getEmail().equals(null) || objUser.getEmail() == "")) {
			return new ModelAndView("failure");
		} else {
			return new ModelAndView("success");
		}
	}

}
