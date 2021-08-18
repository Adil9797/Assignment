package com.assignment.Asiignment2.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Student_Project")
public class StdProject {
	
	@OneToOne(cascade =CascadeType.ALL)
	private Student student;
	
	
	@OneToOne(cascade =CascadeType.ALL)
	private Project project;
	
	@Id
	@Column(name = "designation")
	private String designation;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public StdProject(Student student, Project project, String designation) {
		super();
		this.student = student;
		this.project = project;
		this.designation = designation;
	}

	public StdProject() {
		super();
	}

	
	
	

}
