package com.ProjetoSpring.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSpring.CursoSpring.entities.OrderItem;
import com.ProjetoSpring.CursoSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}