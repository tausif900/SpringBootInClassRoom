package com.study.springbootbasics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.springbootbasics.entities.Product;

@RestController
public class SecondController {

	@GetMapping("/get-product")
	public Product getProduct() {
		return new Product(101, "Laptop", 45000);
	}

//	Now if we want to more products so we store in an ArrayList

	@GetMapping("/products")
	public List<Product> gellAllProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "Mobile", 20000));
		products.add(new Product(102, "Tablet", 25000));
		products.add(new Product(103, "Computer", 50000));
		return products;
	}
}
