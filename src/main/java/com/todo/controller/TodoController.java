package com.todo.controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.todo.pojos.Todo;
import com.todo.service.TodoService;


@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	public TodoController() {
		System.out.println("in todo controller");
	}
	
	
	@GetMapping
	public List<Todo> getAllTasks(){
		System.out.println("In get all");
		return todoService.getAllTodo();
	}

	
	@PostMapping
	public String addNewTask(Todo todo) {
		System.out.println("in add task");
		return todoService.addTask(todo)+"added task successfully";
	}
	
	@PutMapping("/{taskId}")
	public String updateTask(Long id, Todo todo) {
		System.out.println("in update task");
		return todoService.updateTask(todo) +"task updated successfully";
	}
	
	@DeleteMapping("/{taskId}")
	public String deleteTask(Long id) {
		System.out.println("in delete task");
		return todoService.deleteTask(id)+"Task deleted successfully";
	}
	
	
}
