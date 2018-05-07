package com.heb.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heb.beans.Product;
import com.heb.dao.ProductRepositoryIntf;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*")
public class ProductController {

	@Autowired
	private ProductRepositoryIntf productRepository;

	
	@GetMapping()
	public List<Product> getProducts(){
		return productRepository.findAll();
		
	}
	
	
	@GetMapping("/products/id/{id}")
	public Optional<Product> getProductsbyId(@PathVariable Long id){
		return productRepository.findById(id);
		
	}
	
	
	@GetMapping("/products/description/{description}")
	public List<Product> getProductsByDescription(@PathVariable String description){
		return productRepository.findByDescriptionIgnoreCaseContaining(description);
		
	}
	
	@GetMapping("/products/department/{department}")
	public List<Product> getProducts(@PathVariable String department){
		return productRepository.findByDepartmentIgnoreCaseContaining(department);
		
	}
}
