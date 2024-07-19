package com.ProjetoSpring.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSpring.CursoSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
