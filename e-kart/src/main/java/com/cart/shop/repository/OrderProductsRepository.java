package com.cart.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.shop.entity.OrderProducts;

@Repository
public interface OrderProductsRepository extends JpaRepository<OrderProducts, Long>{

}
