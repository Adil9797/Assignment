package com.assignment.Asiignment2.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name = "Std_No")
	private String No;
	@Column(name = "Std_Name")
	private String Name;
	@Column(name = "Std_Dob")
	private String Dob;
	@Column(name = "Std_Doj")
	private String Doj;
	
	
	public String getNo() {
		return No;
	}
	public void setNo(String no) {
		No = no;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getDoj() {
		return Doj;
	}
	public void setDoj(String doj) {
		Doj = doj;
	}
	public Student(String no, String name, String dob, String doj) {
		super();
		No = no;
		Name = name;
		Dob = dob;
		Doj = doj;
	}
	public Student() {
		super();
	}
	

	
	
}
