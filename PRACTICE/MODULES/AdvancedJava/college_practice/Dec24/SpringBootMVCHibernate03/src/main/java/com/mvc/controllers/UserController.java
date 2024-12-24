package com.mvc.controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.pojos.Users;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	SessionFactory hibernateFactory;

	@RequestMapping(method = RequestMethod.GET, value = "/login")
	public void login(Model data) {
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String checkUser(@Valid @ModelAttribute("objUser") Users objUser, BindingResult result) {
		if (result.hasErrors()) {
			return "login";
		} else {
			return "forward:authenticate";
		}
	}

	@RequestMapping("/authenticate")
	public ModelAndView auth(@ModelAttribute("user") Users objUser) {
		try (Session hibernateSession = hibernateFactory.openSession()) {
			System.out.println("@@@@@@@@@@@@@@ in authenticate @@@@@@@@@@@@@@@@@@@@@");
			Users dbUser = (Users) hibernateSession.get(Users.class, objUser.getUsername());
			if (dbUser.getPassword().equals(objUser.getPassword())) {
				return new ModelAndView("success", "data", "user authenticated successfully");
			} else {
				return new ModelAndView("failure", "data", "authentication failure");
			}
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/register")
	public void register(Model data) {
		System.out.println("@@@@@@@@@@@ REGISTER @@@@@@@@@@");
		Users objUser = new Users();
		data.addAttribute("objUser", objUser);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ModelAndView register(@ModelAttribute("objUser") Users objUser) {
		try (Session hibernateSession = hibernateFactory.openSession()) {
			Transaction tx = hibernateSession.beginTransaction();
//			System.out.println("######## objUser : " + objUser);
			hibernateSession.persist(objUser);
			tx.commit();
			return new ModelAndView("login");
		}
	}

}
