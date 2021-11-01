package com.cart.shop.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "USER")
//@SQLDelete(sql = "UPDATE USER_TABLE SET deleted = true WHERE id=?")
//@Where(clause = "deleted=false")
public class User {
	@Id // Taking Id as Primary key
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userID;

	private String username;

	private String email;
	private String mobile;
	@CreationTimestamp
	private Date createdAt;
	private String createdBy;
	@UpdateTimestamp
	private Date modifiedAt;
	private String modifiedBy;
	

	@OneToMany(mappedBy = "user")
	private List<Address> address;
	@OneToMany(mappedBy = "user")
	private List<Ordering> order;
	private boolean deleted;

}
