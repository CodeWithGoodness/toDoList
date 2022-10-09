package com.goodness.todoapp.springbootapp;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**import com.goodness.todoapp.entity.ToDo;
import com.goodness.todoapp.entity.User;
import com.goodness.todoapp.repository.TodoRepository;
import com.goodness.todoapp.repository.UserRepository;**/

@SpringBootApplication
public class ToDoListApplication  {

	/**
	 * @Autowired private UserRepository userRepository;
	 * 
	 * @Autowired private TodoRepository todoRepository;
	 * 
	 **/
	public static void main(String[] args) {
		SpringApplication.run(ToDoListApplication.class, args);
	}

	/**
	 * @Override public void run(String... args) throws Exception {
	 * 
	 *           User user = new User(); user.setId(1L); user.setPassword("should be
	 *           hashed"); user.setUsername("John");
	 * 
	 *           ToDo todo = new ToDo(); todo.setId(1L); todo.setContent("Upload
	 *           video to YT");
	 * 
	 *           user.getTodoList().add(todo);
	 * 
	 *           todoRepository.save(todo); userRepository.save(user); }
	 **/
}
