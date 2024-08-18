package com.marcthegamer.todoapi.persistence.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String description;
	private LocalDateTime creationDate;
	private LocalDateTime estimatedFinishDate;
	private boolean finished;
	private TaskStatus taskStatus;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getEstimatedFinishDate() {
		return estimatedFinishDate;
	}
	public void setEstimatedFinishDate(LocalDateTime estimatedFinishDate) {
		this.estimatedFinishDate = estimatedFinishDate;
	}
	public boolean isFinished() {
		return finished;
	}
	public void setFinished(boolean finished) {
		this.finished = finished;
	}
	public TaskStatus getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(TaskStatus taskStatus) {
		this.taskStatus = taskStatus;
	}

}
