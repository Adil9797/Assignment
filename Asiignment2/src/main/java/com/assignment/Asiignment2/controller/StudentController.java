package com.assignment.Asiignment2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Asiignment2.bean.Student;
import com.assignment.Asiignment2.service.StudentService;


@RestController
public class StudentController {
	
	
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudent(){
		return studentService.getAllStudents();		
	}
	

	@RequestMapping(method = RequestMethod.POST, value="/students")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/students/{id}")
	public void updateStudent(@PathVariable String id, @RequestBody Student student)
	{
		studentService.updateStudent(id, student);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/students/{id}")
	public void DeleteStudent(@PathVariable String id)
	{
		studentService.deleteStudent(id);
	}
	
	
	

}
