package com.goodness.projects.todoapp.com.goodness.projects.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodness.projects.todoapp.com.goodness.projects.todoapp.entity.ToDo;

public interface TodoRepository extends JpaRepository<ToDo, Long> {

}
