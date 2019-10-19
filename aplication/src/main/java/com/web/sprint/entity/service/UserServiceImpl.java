package com.web.sprint.entity.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.web.sprint.entity.User;
import com.web.sprint.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository repository;

	@Override
	public Iterable<User> getAllUsers() {
		return repository.findAll();
	}
	
	
	private boolean checkUsernameAvailable(User user) throws Exception  {
		
		Optional<User> userFond = repository.findByUsername(user.getUsername());
		if (userFond.isPresent()) {
			throw new Exception("userName no esta disponible");
		}
		return true;
	}
	
	private boolean checkPasswordValid(User user) throws Exception {
		if(user.getConfirmPassword()==null || user.getConfirmPassword().isEmpty()) {
			throw new Exception("Confirme el password es obligatorio");
		}
		
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			throw new Exception("password y confirm password no so iguales");
		}
		return true;
	}


	@Override
	public User createUser(User user) throws Exception {
	
		if (checkUsernameAvailable(user) && checkPasswordValid(user)) {
			user = repository.save(user);
		}
		return user;
	}


	@Override
	public User getUserById(Long id) throws Exception {
		
		User user = repository.findById(id).orElseThrow(() -> new Exception("User does not exist"));
		return user;
	}


	@Override
	public User updateUser(User fromUser) throws Exception {
	
	User toUse = getUserById(fromUser.getId());
	mapUser(fromUser,toUse);
	return repository.save(toUse);
		
	}
	
	/**
	 * Map everythin but the password.
	 * @param from
	 * @param to
	 */
	protected void mapUser(User from,User to) {
		to.setUsername(from.getUsername());
		to.setFirstName(from.getFirstName());
		to.setLastName(from.getLastName());
		to.setEmail(from.getEmail());
		to.setRoles(from.getRoles());
	}
	
	
	
/*
 * 
 * private boolean checkUserNameExists(User user) throws Exception  {
 
		Optional <User>  userFond= userRepository.findByUsername(user.getUsername());
		if (userFond.isPresent()) {
			throw new Exception("userName no esta disponible");
		}
		return false;
	}
	
	private boolean checkPasswordMatch(User user) throws Exception {
		
		if(!user.getPassword().equals(user.getConfirmPassword())) {
			throw new Exception("password y confirm password no so iguales");
		}
		return true;
	}
	
	
//   UN Ejemplo de como obtener de una lista los user por estatus
//	@Override
//	public Iterable<Set> getAllUsers() {
//		
//		return userRepository.findAllByStatus("active");
//	}
	
	*/
	
	
}
