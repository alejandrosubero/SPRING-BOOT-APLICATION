package com.web.sprint.entity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.sprint.entity.User;
import com.web.sprint.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;

	@Override
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	
//   UN Ejemplo de como obtener de una lista los user por estatus
//	@Override
//	public Iterable<Set> getAllUsers() {
//		
//		return userRepository.findAllByStatus("active");
//	}
	
	
	
	
}
