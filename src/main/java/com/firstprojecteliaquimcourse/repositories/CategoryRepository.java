package com.firstprojecteliaquimcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.firstprojecteliaquimcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
