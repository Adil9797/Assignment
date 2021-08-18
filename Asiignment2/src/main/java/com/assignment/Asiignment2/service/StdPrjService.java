package com.assignment.Asiignment2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.Asiignment2.bean.StdProject;
import com.assignment.Asiignment2.repository.StdPrjRepository;

@Service
public class StdPrjService {

	@Autowired
	public StdPrjRepository stdprjrepo;
	

	public List<StdProject> getAllStudents()
	{
		List<StdProject> stdProject = new ArrayList<>();
		stdprjrepo.findAll().forEach(stdProject::add);
		return stdProject;
	}

	public void addStudent(StdProject stdProject) {
		stdprjrepo.save(stdProject);
		
	}

	public void updateStudent(String id, StdProject stdProject) {
		stdprjrepo.save(stdProject);
		
	}

	public void deleteStudent(String id) {
		stdprjrepo.deleteById(id);
		
	}
	
	
}
