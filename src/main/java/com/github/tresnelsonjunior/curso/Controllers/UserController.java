package com.github.tresnelsonjunior.curso.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.tresnelsonjunior.curso.Domain.User;

@RestController
@RequestMapping("api/users")
public class UserController {

    @GetMapping()
    public ResponseEntity<User> FindAll() {
    	
    	User usuer = new User(1L, "Nelson", "3nelsonjunior@gmail.com", "(32)98416-3554", "123456");
        
    	return ResponseEntity.ok(usuer);
    }

    
}