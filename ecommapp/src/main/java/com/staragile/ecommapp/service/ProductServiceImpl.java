package com.staragile.ecommapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.staragile.ecommapp.dao.ProductRepository;
import com.staragile.ecommapp.data.Product;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepo;
	
	@Override
	public Product addProduct(Product product) {
		
		return productRepo.save(product);
		
	}

	@Override
	public Product getProductById(Integer productId) {
		Optional<Product> product = productRepo.findById(productId);
		if(product.isPresent()) {
			return product.get();
		}
		return null;
	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> prod =productRepo.findById(product.getProductId());
		if(prod.isEmpty()) {
			return product;
		}else {
			Product prodct= prod.get();
			prodct.setDescription(product.getDescription());
			prodct.setPrice(product.getPrice());
			prodct.setQuantity(product.getQuantity());
			return productRepo.save(prodct);//save the entity in database
		}
		
	}

	@Override
	public String deleteProductById(Integer productId) {
		productRepo.deleteById(productId);
		return "Deleted successfully";
	}

	@Override
	public List<Product> getProducts() {
		
		return (List<Product>) productRepo.findAll();
	}

}
