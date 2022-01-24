package com.oguztopal.task.management.service.impl;

import com.oguztopal.task.management.dto.ProjectDto;
import com.oguztopal.task.management.entity.Projects;
import com.oguztopal.task.management.repository.ProjectRepository;
import com.oguztopal.task.management.service.ProjectService;
import com.oguztopal.task.management.util.DataResult;
import com.oguztopal.task.management.util.MapperUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl  implements ProjectService {

	private final ProjectRepository projectRepository;
	private final MapperUtil modelMapper;

	@Autowired
	public ProjectServiceImpl(ProjectRepository projectRepository, MapperUtil modelMapper) {
		this.projectRepository = projectRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public DataResult<ProjectDto> findAllProjects() {
		List<Projects> projectsList = projectRepository.findAll();
		return new DataResult<>(modelMapper.mapAll(projectsList,ProjectDto.class),true);
	}
}
