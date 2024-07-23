package com.ProjetoSpring.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSpring.CursoSpring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
