package com.cart.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.shop.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
