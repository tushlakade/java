package com.scp.stud;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.PrimaryKeyJoinColumns;
import javax.persistence.Table;

@Entity
@Table(name ="std_details")
public class student {
	@Id
    
	private int std_id;
	private String stdName;
	//private String department;
	//private int age;
	public student(int std_id, String stdName) {
		super();
		this.std_id = std_id;
		this.stdName = stdName;
	//	this.department = department;
	//	this.age = age;
	}
	
	
	public student() {
		
	}
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
}
