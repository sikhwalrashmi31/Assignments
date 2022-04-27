package com.example.services;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entities.User;

@Service
public class ServiceImpl implements Service {

	List<User> list = new ArrayList<>();

    public ServiceImpl() {
        list.add(new User("Mahek", "Mahek@123", "mahek@gmail.com"));
    }

    // Get All Users
    public List<User> getAllUsers() {
        return this.list;
    }

    // Get Users By Username
    public User getUser(String username) {
        return this.list.stream().filter((user) -> user.getUsername().equals(username)).findAny().orElse(null);
    }

    // To set users
    public User addUser(User user) {
        this.list.add(user);
        return user;
    }


	@Override
	public String value() {
		return null;
	}

	@Override
	public Class<? extends Annotation> annotationType() {
		return null;
	}

	
}
