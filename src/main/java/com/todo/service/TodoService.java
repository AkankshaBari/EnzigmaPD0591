package com.todo.service;

import java.util.List;
import java.util.Optional;

import com.todo.pojos.Todo;

public interface TodoService {
	
	
	List<Todo> getAllTodo();
	
	String addTask(Todo todo);
	
	String updateTask(Todo todo);
	
	String deleteTask(Long id);

}
