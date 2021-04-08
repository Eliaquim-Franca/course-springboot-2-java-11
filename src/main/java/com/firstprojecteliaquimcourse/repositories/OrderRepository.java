package com.firstprojecteliaquimcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstprojecteliaquimcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
