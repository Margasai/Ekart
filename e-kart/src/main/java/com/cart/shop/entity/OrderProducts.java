package com.cart.shop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orderProducts")
public class OrderProducts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderProductId;
	private float productPrice;
	private Long productQty;
//	@ManyToOne
//	private Ordering order;

}
