package com.oguztopal.task.management.service.impl;

import com.oguztopal.task.management.dto.TaskDto;
import com.oguztopal.task.management.entity.Tasks;
import com.oguztopal.task.management.repository.TasksRepository;
import com.oguztopal.task.management.service.TaskService;
import com.oguztopal.task.management.util.DataResult;
import com.oguztopal.task.management.util.MapperUtil;
import com.oguztopal.task.management.util.SingleDataResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskServiceImpl implements TaskService {

	private final TasksRepository tasksRepository;
	private final MapperUtil modelMapper;

	@Autowired
	public TaskServiceImpl(TasksRepository tasksRepository, MapperUtil modelMapper) {
		this.tasksRepository = tasksRepository;
		this.modelMapper = modelMapper;
	}

	@Override
	public DataResult<TaskDto> findAllTasks() {
		List<Tasks> tasksList = tasksRepository.findAll();
		return new DataResult<>(modelMapper.mapAll(tasksList, TaskDto.class),true);
	}

	@Override
	public SingleDataResult<TaskDto> updateTask(TaskDto taskDto) {
		TaskDto updatedTask = modelMapper.map(tasksRepository.save(modelMapper.map(taskDto,Tasks.class)),TaskDto.class);
		return new SingleDataResult<>(updatedTask,true);
	}
}
