package com.github.tresnelsonjunior.curso.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.tresnelsonjunior.curso.Domain.User;
import com.github.tresnelsonjunior.curso.Service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {
	
	@Autowired
	private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User>> FindAll() {
    	List<User> listaUser = userService.findAll();
    	return ResponseEntity.ok().body(listaUser);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> FindById(@PathVariable long id) {
    	User user = userService.findById(id);
    	return ResponseEntity.ok().body(user);
    }

    
}