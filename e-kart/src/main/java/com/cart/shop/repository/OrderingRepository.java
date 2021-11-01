package com.cart.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.shop.entity.Ordering;

@Repository
public interface OrderingRepository extends JpaRepository<Ordering, Long> {

}
