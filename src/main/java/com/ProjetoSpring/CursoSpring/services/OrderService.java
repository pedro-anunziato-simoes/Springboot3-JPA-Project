package com.ProjetoSpring.CursoSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ProjetoSpring.CursoSpring.entities.Order;
import com.ProjetoSpring.CursoSpring.repositories.OrderRepository;

import jakarta.websocket.server.ServerEndpoint;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public List<Order> findAll() {
		return repository.findAll();
	}

	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
