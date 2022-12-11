package com.staragile.ecommapp.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_info")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer productId;
	@Column(name="product_name")
	private String description;
	private Double price;
	private Integer quantity;
	//No argument constructor or default constructor
	public Product() {
		
	}
	//Argument based or Parameterized constructor
	public Product(Integer productId, String description, Double price, Integer quantity) {
		this.productId = productId;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", description=" + description + ", price=" + price + ", quantity="
				+ quantity + "]";
	}
	
	
	
	

}
