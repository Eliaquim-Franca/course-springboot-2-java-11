package com.firstprojecteliaquimcourse.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstprojecteliaquimcourse.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "maria", "cida@gmail.com", "55555555", "123456");
		return ResponseEntity.ok().body(u);
	}
}
