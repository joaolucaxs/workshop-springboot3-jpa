package com.joaolucas.coursespringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaolucas.coursespringboot.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
