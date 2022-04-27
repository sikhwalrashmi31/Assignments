package com.example.services;

import java.util.List;

import com.example.entities.User;


public interface Service {

    public List<User> getAllUsers();

    public User getUser(String username);

    public User addUser(User user);
}