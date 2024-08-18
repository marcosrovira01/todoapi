package com.marcthegamer.todoapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.marcthegamer.todoapi.persistence.entity.Task;
import com.marcthegamer.todoapi.persistence.entity.TaskStatus;
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
	
	@GetMapping
	public List<Task> findAll(){
		return this.taskService.findAll();
	}
	
	@GetMapping("/status/{status}")
	public List<Task> findAllByTaskStatus(@PathVariable("status") TaskStatus status){
		return this.taskService.findAllByTaskStatus(status);
	}
	
	@PostMapping("/mark_as_finished/{id}")
	public void markTaskAsFinished(@PathVariable("id") Long id) {
		this.taskService.markTaskAsFinished(id);
	}
	
	@PostMapping("/delete_task/{id}")
	public void deleteTaskById(@PathVariable("id") Long id) {
		this.taskService.deleteTaskById(id);
	}
	
}
