package com.assignment.Asiignment2.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Project")
public class Project {
	@Id
	@Column(name = "Prj_No")
	private String No;
	@Column(name = "Prj_Name")
	private String Name;
	@Column(name = "Prj_Dur")
	private String Dur;
	@Column(name = "Prj_Platform")
	private String Platform;
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
	public String getDur() {
		return Dur;
	}
	public void setDur(String dur) {
		Dur = dur;
	}
	public String getPlatform() {
		return Platform;
	}
	public void setPlatform(String platform) {
		Platform = platform;
	}
	public Project(String no, String name, String dur, String platform) {
		super();
		No = no;
		Name = name;
		Dur = dur;
		Platform = platform;
	}
	public Project() {
		super();
	}
	
}
