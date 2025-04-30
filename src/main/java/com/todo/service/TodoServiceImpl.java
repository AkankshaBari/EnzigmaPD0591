package com.todo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.todo.dao.TodoDao;
import com.todo.exception.ResourceNotFoundException;
import com.todo.pojos.Todo;

public class TodoServiceImpl implements TodoService {

	@Autowired
	public TodoDao todoDao;

	

	@Override
	public List<Todo> getAllTodo() {
		
		List<Todo> list = todoDao.findAll();
		return list;
	}

	@Override
	public String addTask(Todo todo) {
		
		 todoDao.saveAll(todo);
		 
		 return "Added successfully";
	}

	@Override
	public String updateTask(Todo todo) {
		
		todoDao.save(todo);
		return "updated successfully";
	}

	@Override
	public String deleteTask(Long id) {
		
		if(todoDao.existsById(id))
		{
		todoDao.deleteById(id);
		}
		return "deleted successfully";
	}
	
	
}
