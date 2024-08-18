package com.marcthegamer.todoapi.service.dto;

import java.time.LocalDateTime;

public class TaskInDTO {
	private String title;
	private String description;
	private LocalDateTime estimatedFinishDate;
	
	
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
	public LocalDateTime getEstimatedFinishDate() {
		return estimatedFinishDate;
	}
	public void setEstimatedFinishDate(LocalDateTime estimatedFinishDate) {
		this.estimatedFinishDate = estimatedFinishDate;
	}

}
