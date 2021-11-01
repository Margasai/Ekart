package com.cart.shop.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="ordering")
public class Ordering {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long orderId;
	@ManyToOne(fetch = FetchType.EAGER)
    private User user;
	private String  orderNo;
	private Long orderTotal;
	private Long orderQty;
	@CreationTimestamp
	private Date createdAt;
	private String createdBy;
	@UpdateTimestamp
	private Date modifiedAt;
	private String modifiedBy;

}
