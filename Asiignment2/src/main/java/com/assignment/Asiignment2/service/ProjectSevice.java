package com.assignment.Asiignment2.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Asiignment2.bean.Project;
import com.assignment.Asiignment2.repository.ProjectRepository;



@Service
public class ProjectSevice {
	
	@Autowired
	public ProjectRepository projectRepo;
	

	public List<Project> getAllProjects()
	{
		List<Project> projects = new ArrayList<>();
		projectRepo.findAll().forEach(projects::add);
		return projects;
	}

	public void addProject(Project project) {
		projectRepo.save(project);
		
	}

	public void updateProject(String id, Project project) {
		projectRepo.save(project);
		
	}

	public void deleteProject(String id) {
		projectRepo.deleteById(id);
		
	}

}
