package com.oguztopal.task.management.controller;

import com.oguztopal.task.management.dto.TaskDto;
import com.oguztopal.task.management.service.TaskService;
import com.oguztopal.task.management.util.DataResult;
import com.oguztopal.task.management.util.SingleDataResult;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("tasks")
@AllArgsConstructor
public class TasksController {

	private TaskService taskService;

	@GetMapping
	public ResponseEntity<DataResult<TaskDto>> getAllProjects(){
		log.info("project aliniyor");
		DataResult<TaskDto> result = taskService.findAllTasks();
		log.info("projects alindi");
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<SingleDataResult<TaskDto>> updateTask(@RequestBody TaskDto taskDto){
		log.info("{} 'isimli task guncellenecek" , taskDto.getTaskName());
		SingleDataResult<TaskDto> result = taskService.updateTask(taskDto);
		log.info("{} ' isimli task guncellendi." , taskDto.getTaskName());
		return new ResponseEntity<>(result,HttpStatus.OK);
	}

}
