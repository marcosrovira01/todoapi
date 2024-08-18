package com.marcthegamer.todoapi.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.marcthegamer.todoapi.persistence.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	
}
