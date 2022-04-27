package com.example.demo;

import model.User;
import repository.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityAssignment2Q2Application implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityAssignment2Q2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user1 = new User();
		user1.setEmail("mahek@gmail.com");
		user1.setUsername("mahek");
		user1.setPassword(bCryptPasswordEncoder.encode("mahek@123"));
		user1.setRole("ROLE_ADMIN");

		userRepo.save(user1);

		User user2 = new User();
		user2.setEmail("Isha@gmail.com");
		user2.setUsername("Isha");
		user2.setPassword(bCryptPasswordEncoder.encode("Isha@123"));
		user2.setRole("ROLE_NORMAL");

		userRepo.save(user2);
	}

}
