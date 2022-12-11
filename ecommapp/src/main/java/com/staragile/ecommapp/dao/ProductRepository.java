package com.staragile.ecommapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.staragile.ecommapp.data.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
