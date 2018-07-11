package com.scp.department;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.Id;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "dept_details")
public class department {
	@Id
	private int id;
	private String dept_name;
	public department(int id, String dept_name) {
		super();
		this.id = id;
		this.dept_name = dept_name;
	}
	public department() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	
	

}
