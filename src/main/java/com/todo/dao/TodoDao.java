package com.todo.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.todo.pojos.Todo;

public interface TodoDao extends JpaRepository<Todo,Long>{

	void saveAll(Todo todo);

}
