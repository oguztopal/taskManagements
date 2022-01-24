package com.oguztopal.task.management.repository;

import com.oguztopal.task.management.entity.Projects;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjectRepository extends MongoRepository<Projects,String> {

	Projects findByProjectName(String projectName);
}
