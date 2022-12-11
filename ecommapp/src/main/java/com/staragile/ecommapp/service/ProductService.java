package com.staragile.ecommapp.service;

import java.util.List;

import com.staragile.ecommapp.data.Product;

public interface ProductService {
	//Create
	public Product addProduct(Product product);
	//Retrieve by Id
	public Product getProductById(Integer productId);
	//Update
	public Product updateProduct(Product product);
	//Delete By Id
	public String deleteProductById(Integer productId);
	//Retrieve All
	public List<Product> getProducts();
}
