package com.web.sprint.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.sprint.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public Optional<User> findByUsername(String userName);
	
	//public Optional findByIdAndPassword(Long id, String password);
	
	// public Optional findByUsernameOrEmail(String username, String email); //esto es en caso que se quiera buscar con dos o mas parametros o se usa and 
	//public Iterable<Set> findAllByStatus(String Status); //busca a los user por status
}
