package com.joaolucas.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.coursespringboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
	
}
