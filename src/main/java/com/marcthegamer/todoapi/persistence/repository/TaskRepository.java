package com.marcthegamer.todoapi.persistence.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.marcthegamer.todoapi.persistence.entity.Task;
import com.marcthegamer.todoapi.persistence.entity.TaskStatus;

public interface TaskRepository extends JpaRepository<Task, Long>{
	public List<Task> findAllByTaskStatus(TaskStatus taskStatus);
}
