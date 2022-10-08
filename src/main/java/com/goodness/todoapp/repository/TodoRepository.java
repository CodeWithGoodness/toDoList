package com.goodness.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodness.todoapp.entity.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {

}
