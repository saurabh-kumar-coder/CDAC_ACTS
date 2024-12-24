package com.mvc.controllers;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvc.pojos.Category;

@Controller
public class CategoryController {
	
	@Autowired
	SessionFactory hibernateFactory;
	
	@RequestMapping(method = RequestMethod.GET, value = "/showcategory")
	public String category(Model data) {
		System.out.println("@@@@@@@@@@@@@@ in show category @@@@@@@@@@@@@@@@@@@@@");
		
		Category objCategory = new Category();
		data.addAttribute("objCategory", objCategory);
		return "redirect:/category";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/category")
	public ModelAndView showCategory(@ModelAttribute("objCategory") Category objCategory) {
		
		try(Session hibernateSession = hibernateFactory.openSession()) {
			List<Category> categoryList = hibernateSession.createQuery("from Category", Category.class).list();
			System.out.println("%%%%%%%%%%  Category List : " + categoryList);
			categoryList.forEach(category -> {
	            System.out.println("Category Name: " + category.getCategoryName());
	            System.out.println("Category Description: " + category.getCategoryDescription());
	            System.out.println("Category Image URL: " + category.getCategoryImageUrl());

	        });
			return new ModelAndView("category", "categoryList", categoryList);
		} catch(Exception e) {
			e.printStackTrace();
			return new ModelAndView("login");
		}
		
	}
	
}

/*
 *
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <c:forEach var="category" items="${categoryList}">
			<tr>
				<th>${category.categoryName}</th>
				<th>${category.categoryDescription }</th>
				<th>${category.categoryImageUrl }</th>
			</tr>
		</c:forEach>
*/
