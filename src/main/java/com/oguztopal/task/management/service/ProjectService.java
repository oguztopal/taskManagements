package com.oguztopal.task.management.service;

import com.oguztopal.task.management.dto.ProjectDto;
import com.oguztopal.task.management.util.DataResult;

public interface ProjectService {

	DataResult<ProjectDto> findAllProjects();
}
