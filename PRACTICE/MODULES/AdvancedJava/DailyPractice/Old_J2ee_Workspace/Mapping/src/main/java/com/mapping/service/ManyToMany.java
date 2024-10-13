package com.mapping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entities.Categories;
import com.mapping.entities.Products;
import com.mapping.repository.CategoryRepository;
import com.mapping.repository.ProductRepository;

@RestController
@RequestMapping("/manyToMany")
public class ManyToMany {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/data")
	public String putData() {
		Products product1 = new Products();
		product1.setPId("pId1");
		product1.setProductName("Iphone 14 max pro");
		Products product2 = new Products();
		product2.setPId("pId2");
		product2.setProductName("Samsung S22 Ultra");
		Products product3 = new Products();
		product3.setPId("pId3");
		product3.setProductName("Samsung TV");
		Products product4 = new Products();
		product4.setPId("pId4");
		product4.setProductName("LG TV");
		
		
//		productRepository.save(product1);
		Categories category1 = new Categories();
		category1.setCId("cid1");
		category1.setTitle("Mobile");
		Categories category2 = new Categories();
		category2.setCId("cid2");
		category2.setTitle("TV");
		
		List<Products> category1Products = category1.getProducts();
		category1Products.add(product1);
		category1Products.add(product2);
		
		List<Products> category2Products = category2.getProducts();
		category2Products.add(product1);
		category2Products.add(product3);
		category2Products.add(product4);
		
		categoryRepository.save(category1);
		categoryRepository.save(category2);
		
		return "many to many data is set";
	}
	
	
	@GetMapping("/data")
	public String getData() {
		Categories category = categoryRepository.findById("cid2").get();
		System.out.println(category.getProducts().size());
		return "" + category.getProducts().size();
	}
}
