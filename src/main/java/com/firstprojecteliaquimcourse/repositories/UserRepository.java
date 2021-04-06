package com.firstprojecteliaquimcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstprojecteliaquimcourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
