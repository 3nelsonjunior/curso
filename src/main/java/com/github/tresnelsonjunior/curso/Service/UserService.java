package com.github.tresnelsonjunior.curso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.tresnelsonjunior.curso.Domain.User;
import com.github.tresnelsonjunior.curso.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		List<User> listaUser = userRepository.findAll();
		return listaUser;
	}
	
	public User findById(long id) {
		Optional<User> user = userRepository.findById(id);
		return user.get();
	}

}
