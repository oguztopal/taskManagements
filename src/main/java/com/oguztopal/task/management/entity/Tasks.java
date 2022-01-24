package com.oguztopal.task.management.entity;

import com.oguztopal.task.management.enums.TasksState;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Document(collection = "tasks")
@NoArgsConstructor
public class Tasks {

	@Id
	protected BigInteger id;
	protected String taskName;
	protected Projects projects;
	protected Boolean hasDeasy;
	protected String description;
	protected TasksState state;
	protected Boolean isCompleted;
	protected LocalDateTime created;

	public Tasks(String taskName, Projects projects, Boolean hasDeasy, String description, TasksState state, Boolean isCompleted, LocalDateTime created) {
		this.taskName = taskName;
		this.projects = projects;
		this.hasDeasy = hasDeasy;
		this.description = description;
		this.state = state;
		this.isCompleted = isCompleted;
		this.created = created;
	}
}
