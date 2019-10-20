package com.web.sprint.entity.service;

import javax.validation.Valid;

import com.web.sprint.entity.User;

public interface UserService {

	public Iterable <User> getAllUsers();
	
	public User createUser(User user) throws Exception;
	 //metodo retornara user por si se requiere realisar una validacion despues de crear el usuario.
	
	public User getUserById(Long id) throws Exception;

	public User updateUser( User user) throws Exception;

	public void deleteUser(Long id) throws Exception;
	
	
}
