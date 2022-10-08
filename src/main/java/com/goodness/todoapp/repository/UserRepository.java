package com.goodness.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.goodness.todoapp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
