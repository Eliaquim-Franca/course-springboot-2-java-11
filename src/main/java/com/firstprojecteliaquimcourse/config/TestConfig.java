package com.firstprojecteliaquimcourse.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.firstprojecteliaquimcourse.entities.User;
import com.firstprojecteliaquimcourse.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "maria", "cida@gmail.com", "44444", "123456");
		User u2 = new User(null, "Alex", "xela@gmail.com", "422626", "456456");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
	
	
}
