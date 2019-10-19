package com.web.sprint.entity.service;

import com.web.sprint.entity.User;

public interface UserService {

	public Iterable <User> getAllUsers();
	public User createUser(User user) throws Exception;
	 //metodo retornara user por si se requiere realisar una validacion despues de crear el usuario.
	
}
