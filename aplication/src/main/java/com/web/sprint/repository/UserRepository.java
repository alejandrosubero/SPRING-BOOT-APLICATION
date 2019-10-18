package com.web.sprint.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.sprint.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	//public Iterable<Set> findAllByStatus(String Status); //busca a los user por status
	//public Optional findByUsername(String username);
	//public Optional findByIdAndPassword(Long id, String password);
	
}
