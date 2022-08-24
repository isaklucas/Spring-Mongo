package com.isaklucas.springmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaklucas.springmongo.domain.User;
import com.isaklucas.springmongo.repository.UserRepository;
import com.isaklucas.springmongo.services.exception.ObjectNotFound;

@Service
public class UserService {
	
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFound("Objeto não encontrado"));
		}

}
