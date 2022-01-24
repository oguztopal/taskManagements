package com.oguztopal.task.management.service;

import com.oguztopal.task.management.dto.TaskDto;
import com.oguztopal.task.management.util.DataResult;
import com.oguztopal.task.management.util.SingleDataResult;

public interface TaskService {

	DataResult<TaskDto> findAllTasks();

	SingleDataResult<TaskDto> updateTask(TaskDto taskDto);
}
