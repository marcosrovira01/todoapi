package com.marcthegamer.todoapi.mapper;

import com.marcthegamer.todoapi.persistence.entity.Task;
import com.marcthegamer.todoapi.persistence.entity.TaskStatus;
import com.marcthegamer.todoapi.service.dto.TaskInDTO;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class TaskInDTOToTask implements IMapper<TaskInDTO, Task>{

	@Override
	public Task map(TaskInDTO in) {
		Task task = new Task();
		task.setTitle(in.getTitle());
		task.setDescription(in.getDescription());
		task.setCreationDate(LocalDateTime.now());
		task.setEstimatedFinishDate(in.getEstimatedFinishDate());
		task.setFinished(false);
		task.setTaskStatus(TaskStatus.ON_TIME);
		return task;
	}

}
