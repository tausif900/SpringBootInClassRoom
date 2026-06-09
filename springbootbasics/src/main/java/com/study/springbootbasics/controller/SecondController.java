package com.study.springbootbasics.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.springbootbasics.entities.Product;

@RestController
public class SecondController {

	@GetMapping("/get-product")
	public Product getProduct() {
		return new Product(101, "Laptop", 45000);
	}

//	Now if we want to add more products so we store in an ArrayList

	@GetMapping("/products")
	public List<Product> gellAllProducts() {
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product(101, "Mobile", 20000));
		products.add(new Product(102, "Tablet", 25000));
		products.add(new Product(103, "Computer", 50000));
		return products;
	}

//	This is a Simple way
//	Adding data to the Server is 'POST'.
//	@PostMapping("/add-product")
//	public String addProduct(@RequestBody Product product) { // Here Post-man me post kiyahua data is product type me
//																// store horaha hai with the help of requestBody annotation
//		return "Product added successfully";
//	}

//	Response String type ka hai...
//	isko me control krsktahu, status code bataskta, ise customization kehte hai..
	@PostMapping("/add-product")
	public ResponseEntity<String> addProduct(@RequestBody Product product) { // Here Post-man me post kiyahua data is
																				// product type me store horaha hai with
																				// the help of requestBody annotation
		return new ResponseEntity<String>("Product added", HttpStatus.CREATED); // ResponseEntity ka obj return krna
																				// rehta hai that has two parameters
																				// ,one is what reponse we want we write
																				// there and then which status Code we
																				// want
	}
}
