package com.oguztopal.task.management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "projects")
@AllArgsConstructor
@NoArgsConstructor
public class Projects {

	@Id
	private String id;
	private String projectName;
}
