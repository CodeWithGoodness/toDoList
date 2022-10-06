package com.goodness.projects.todoapp.com.goodness.projects.todoapp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	private Long id;
	private String username;
	private String password;
	
	@OneToMany
	private List<ToDo> todoList;

	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<ToDo> getTodoList() {
		return todoList;
	}

	public void setTodoList(List<ToDo> todoList) {
		this.todoList = todoList;
	}

}
