package com.ProjetoSpring.CursoSpring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ProjetoSpring.CursoSpring.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/users")
public class UserResourse {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@gmail.com","9999999","12345");		
		return ResponseEntity.ok().body(u);
	}
}
