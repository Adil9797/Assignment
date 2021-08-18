package com.assignment.Asiignment2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Asiignment2.bean.Project;
import com.assignment.Asiignment2.service.ProjectSevice;


@RestController
public class ProjectController {
	

	@Autowired
	private ProjectSevice projectService;
		
	@RequestMapping("/projects")
	public List<Project> getAllProject(){
		return projectService.getAllProjects();		
	}
	

	@RequestMapping(method = RequestMethod.POST, value="/projects")
	public void addProject(@RequestBody Project project)
	{
		projectService.addProject(project);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/projects/{id}")
	public void updateProject(@PathVariable String id, @RequestBody Project project)
	{
		projectService.updateProject(id, project);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/projects/{id}")
	public void DeleteProject(@PathVariable String id)
	{
		projectService.deleteProject(id);
	}
	
	
	

}
