package com.oguztopal.task.management.controller;

import com.oguztopal.task.management.dto.ProjectDto;
import com.oguztopal.task.management.service.ProjectService;
import com.oguztopal.task.management.util.DataResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("projects")
@AllArgsConstructor
public class ProjectController {

	private final ProjectService projectService;

	@GetMapping
	private ResponseEntity<DataResult<ProjectDto>> getAllProjects(){
		log.info("project aliniyor");
		DataResult<ProjectDto> result = projectService.findAllProjects();
		log.info("projects alindi");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}
}
