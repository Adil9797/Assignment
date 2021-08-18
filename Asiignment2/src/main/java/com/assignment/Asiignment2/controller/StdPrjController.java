package com.assignment.Asiignment2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Asiignment2.bean.StdProject;
import com.assignment.Asiignment2.service.StdPrjService;


@RestController
public class StdPrjController {
	
	
	
	@Autowired
	private StdPrjService stdprjservice;
	
	@RequestMapping("/stdprj")
	public List<StdProject> getAllStudent(){
		return stdprjservice.getAllStudents();		
	}
	

	@RequestMapping(method = RequestMethod.POST, value="/stdprj")
	public void addStudent(@RequestBody StdProject student)
	{
		stdprjservice.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/stdprj/{id}")
	public void updateStudent(@PathVariable String id, @RequestBody StdProject student)
	{
		stdprjservice.updateStudent(id, student);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/stdprj/{id}")
	public void DeleteStudent(@PathVariable String id)
	{
		stdprjservice.deleteStudent(id);
	}

}
