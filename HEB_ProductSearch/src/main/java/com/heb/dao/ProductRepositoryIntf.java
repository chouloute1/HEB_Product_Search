package com.heb.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.heb.beans.Product;

public interface ProductRepositoryIntf extends JpaRepository<Product, Long> {

	
	List<Product> findByDescriptionIgnoreCaseContaining(String description);
	
	List<Product> findByDepartmentIgnoreCaseContaining(String department);
	
}
