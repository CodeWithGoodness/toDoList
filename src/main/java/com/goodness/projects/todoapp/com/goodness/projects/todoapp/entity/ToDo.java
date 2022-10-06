package com.goodness.projects.todoapp.com.goodness.projects.todoapp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ToDo {
	@Id
	private Long id;
	private String content;
	private Boolean completed = Boolean.FALSE;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ToDo() {
			}

	public ToDo(Long id, String content, Boolean completed) {
		this.id = id;
		this.content = content;
		this.completed = completed;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

}
