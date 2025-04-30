package com.todo.pojos;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@NoArgsConstructor
@Table(name = "Todo")
public class Todo {
	
	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "task", length = 40)
	private String task;
	@Column(name = "day", length = 10)
	private String day;
	private LocalDate date;
	
}
