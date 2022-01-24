package com.oguztopal.task.management.dto;

import com.oguztopal.task.management.entity.Projects;
import com.oguztopal.task.management.enums.TasksState;
import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
public class TaskDto {

	private BigInteger id;
	private String taskName;
	private Projects projects;
	private Boolean hasDeasy;
	private String description;
	private TasksState state;
	private Boolean isCompleted;
	private LocalDateTime created;
}
