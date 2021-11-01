package com.cart.shop.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name = "product")
//@SQLDelete(sql = "UPDATE product_TABLE SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")
public class Product {
	@Id // Taking Id as Primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	private String productname;
	private String productSKU;
	private Double price;
	private boolean isActive;
	private int qty;
	@CreationTimestamp
	private Date createdAt;
	private String createdBy;
	@UpdateTimestamp
	private Date modifiedAt;
	private String modifiedBy;
	private boolean deleted;
}
