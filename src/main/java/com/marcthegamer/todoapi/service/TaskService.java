package com.marcthegamer.todoapi.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.marcthegamer.todoapi.mapper.TaskInDTOToTask;
import com.marcthegamer.todoapi.persistence.entity.Task;
import com.marcthegamer.todoapi.persistence.entity.TaskStatus;
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
	
	public List<Task> findAllByTaskStatus(TaskStatus taskStatus){
		return this.repository.findAllByTaskStatus(taskStatus);
	}
	
	public void markTaskAsFinished(Long id) {
		Optional<Task> optionalTask = this.repository.findById(id);
		if (optionalTask.isEmpty()) {
			throw new NullPointerException("The task object that you've looked for is empty");
		}else {
			Task task = optionalTask.get();
			task.setFinished(true);
			this.repository.save(task);
		}
	}

}
