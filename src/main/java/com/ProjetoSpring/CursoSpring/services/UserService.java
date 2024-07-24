package com.ProjetoSpring.CursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProjetoSpring.CursoSpring.entities.User;
import com.ProjetoSpring.CursoSpring.repositories.UserRepository;
import com.ProjetoSpring.CursoSpring.services.exceptions.ResourcesNotFoundExecption;


@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ResourcesNotFoundExecption(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	
	public User update(Long id,User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setTelefone(obj.getTelefone());
	}
}