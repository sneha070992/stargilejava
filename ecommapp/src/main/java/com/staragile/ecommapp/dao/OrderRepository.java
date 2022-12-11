package com.staragile.ecommapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.staragile.ecommapp.data.Order;

public interface OrderRepository extends CrudRepository<Order, Integer> {

}
