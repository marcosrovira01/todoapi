package com.marcthegamer.todoapi.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.marcthegamer.todoapi.mapper.TaskInDTOToTask;
import com.marcthegamer.todoapi.persistence.entity.Task;
import com.marcthegamer.todoapi.persistence.repository.TaskRepository;
import com.marcthegamer.todoapi.service.dto.TaskInDTO;

@Service
public class TaskService {
	
	private final TaskRepository repository;
	private final TaskInDTOToTask mapper;
	
	public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	public Task createTask(TaskInDTO taskInDTO) {
		Task task = mapper.map(taskInDTO);
		return this.repository.save(task);
	}
	
	public List<Task> findAll(){
		return this.repository.findAll();
	}

}
