package com.heb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.heb.dao.ProductRepositoryIntf;

@SpringBootApplication
public class HebProductSearchApplication implements CommandLineRunner {

	@Autowired
	private ProductRepositoryIntf productRepository;

	
	public static void main(String[] args) {
		SpringApplication.run(HebProductSearchApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		
	}
}
