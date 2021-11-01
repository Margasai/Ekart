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
@Table(name = "address")
//@SQLDelete(sql = "UPDATE adress_TABLE SET deleted = true WHERE id=?")
//@Where(clause = "deleted_false")
public class Address {
	@Id // Taking Id as Primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long addressId;
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	private String address1;
	private String address2;
	private String pincode;
	private boolean isActive;
	private Boolean isPrimary;
	@CreationTimestamp
	private Date createdAt;
	private String createdBy;
	@UpdateTimestamp
	private Date modifiedAt;
	private String modifiedBy;
	private boolean deleted;

}
