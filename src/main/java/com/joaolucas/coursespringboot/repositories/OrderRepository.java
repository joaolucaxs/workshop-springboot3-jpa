package com.joaolucas.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.coursespringboot.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
