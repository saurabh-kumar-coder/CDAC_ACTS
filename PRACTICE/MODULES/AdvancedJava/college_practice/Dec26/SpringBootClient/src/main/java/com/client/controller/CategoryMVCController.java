package com.client.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class CategoryMVCController {
	
	
	RestTemplate restTemplate = new RestTemplate();

	@Autowired
	HttpServletRequest request;

	@RequestMapping("/showcategories")
	public void showAllCategories(Model data) {
			try {
				int pageNo = Integer.parseInt(request.getParameter("pageNo"));
				int pageSize = Integer.parseInt(request.getParameter("pageSize"));
				URI uri = new URI("http://localhost:8080/category?pageNo=" + pageNo + "&pageSize=" + pageSize);
				ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
				data.addAttribute("categories", response.getBody());
			} catch (NumberFormatException | RestClientException | URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
