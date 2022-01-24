package com.oguztopal.task.management;

import com.oguztopal.task.management.entity.Projects;
import com.oguztopal.task.management.entity.Tasks;
import com.oguztopal.task.management.enums.TasksState;
import com.oguztopal.task.management.repository.ProjectRepository;
import com.oguztopal.task.management.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class TaskManagementApplication implements CommandLineRunner {

	@Autowired
	private TasksRepository tasksRepository;

	@Autowired
	private ProjectRepository projectRepository;

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		/*Projects projects = new Projects();
		projects.setProjectName("sherlock");
		Projects projectId= projectRepository.save(projects);
		Projects projects2 = projectRepository.findByProjectName("vokal");


		// save a couple of customers
		tasksRepository.save(new Tasks("deneme",projectId,true,"deneme", TasksState.TODO ,false,LocalDateTime.now()));
		tasksRepository.save(new Tasks("deneme",projects2,true,"deneme", TasksState.TODO ,false,LocalDateTime.now()));
		tasksRepository.save(new Tasks("deneme",projects2,true,"deneme", TasksState.TODO , false,LocalDateTime.now()));*/


		// fetch all customers
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Tasks tasks : tasksRepository.findAll()) {
			System.out.println(tasks);
		}

	}
}
