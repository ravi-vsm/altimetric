package com.ipd;

public class Employee {
	
	private int eid;
	private String ename;
	private Long esalary;
	private String gender;
	private String dept;
	
	public Employee(int eid, String ename, Long esalary, String gender, String dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.gender = gender;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Long getEsalary() {
		return esalary;
	}

	public void setEsalary(Long esalary) {
		this.esalary = esalary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

}
