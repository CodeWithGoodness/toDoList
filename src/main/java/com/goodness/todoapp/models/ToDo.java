package com.goodness.todoapp.models;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Entity
public class ToDo implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter
	@Setter
	private Long id;
	
	@Getter
	@Setter
	private String description;
	
	@Getter
	@Setter
	private Boolean completed;
	
	@Getter
	@Setter
	private Instant dateCreated = Instant.now();
	
	@Getter
	@Setter
	private Instant dateModified = Instant.now();
	
}
