package com.web.sprint.entity.service;

import com.web.sprint.dto.ChangePasswordForm;
import com.web.sprint.entity.User;
import com.web.sprint.exception.UsernameOrIdNotFound;

public interface UserService {

	public Iterable <User> getAllUsers();
	
	public User createUser(User user) throws Exception;
	 //metodo retornara user por si se requiere realisar una validacion despues de crear el usuario.
	
	public User getUserById(Long id) throws Exception;

	public User updateUser( User user) throws Exception;

	public void deleteUser(Long id) throws  UsernameOrIdNotFound;
	
	public User changePassword(ChangePasswordForm form) throws Exception;
	
	
	
}
