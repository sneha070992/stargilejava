package com.staragile.ecommapp.data;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="order_info")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer orderId;
	private LocalDate orderDate;

	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Integer orderId, LocalDate orderDate) {
		this.orderId = orderId;
		this.orderDate = orderDate;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + "]";
	}

}
