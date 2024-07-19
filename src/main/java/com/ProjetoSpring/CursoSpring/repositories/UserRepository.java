package com.ProjetoSpring.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ProjetoSpring.CursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
