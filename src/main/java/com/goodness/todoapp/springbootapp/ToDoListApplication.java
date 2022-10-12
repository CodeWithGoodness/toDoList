package com.goodness.todoapp.springbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ToDoListApplication  {

	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}
}
