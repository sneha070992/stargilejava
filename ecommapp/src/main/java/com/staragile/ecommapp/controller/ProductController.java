package com.staragile.ecommapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.staragile.ecommapp.data.Product;
import com.staragile.ecommapp.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService prodService;

	//URL - http://localhost:8080/addproduct
	// Create
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		return prodService.addProduct(product);
	}
	//URL - http://localhost:8080/getproductbyid/1
	// Retrieve by Id
	@GetMapping("/getproductbyid/{id}")
	public Product getProductById(@PathVariable("id") Integer productId) {
		return prodService.getProductById(productId);
	}
	
	//URL - http://localhost:8080/updateproduct
	// Update
	@PostMapping("/updateproduct")
	public Product updateProduct(@RequestBody Product product) {
		return prodService.updateProduct(product);
	}
	
	//URL - http://localhost:8080/deleteById?productId=10
	// Delete By Id
	@DeleteMapping("/deleteById")
	public String deleteProductById(@RequestParam Integer productId) {
		return prodService.deleteProductById(productId);
	}

	//URL - http://localhost:8080/getproducts
	// Retrieve All
	@GetMapping("/getproducts")
	public List<Product> getProducts() {
		return prodService.getProducts();
	}

}
