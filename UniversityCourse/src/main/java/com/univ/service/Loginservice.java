package com.univ.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.univ.entity.User;
import com.univ.repository.LoginRepository;



@Service
public class Loginservice {

@Autowired
private LoginRepository repo;
public User saveUser(User user) {
	
	return repo.save(user);
	
}
public User fetchUserById(int id) {
	
	return repo.findById(id);
}
public User fetchUserByIdAndPassword(int id, String password) {
	
	return repo.findByIdAndPassword(id, password);
}


}