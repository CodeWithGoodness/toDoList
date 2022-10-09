package com.goodness.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodness.todoapp.models.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {

}
