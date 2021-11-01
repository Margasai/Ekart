package com.cart.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cart.shop.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
