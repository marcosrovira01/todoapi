package com.marcthegamer.todoapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marcthegamer.todoapi.persistence.entity.Task;
import com.marcthegamer.todoapi.service.TaskService;
import com.marcthegamer.todoapi.service.dto.TaskInDTO;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@PostMapping
	public Task createTask(@RequestBody TaskInDTO taskInDTO) {
		return this.taskService.createTask(taskInDTO);
	}
	
}
