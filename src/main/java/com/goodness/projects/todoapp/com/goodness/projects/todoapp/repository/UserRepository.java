package com.goodness.projects.todoapp.com.goodness.projects.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodness.projects.todoapp.com.goodness.projects.todoapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
