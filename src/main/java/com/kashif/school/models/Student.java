package com.kashif.school.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Long student_id; 
	private String student_name;
	private String student_father;
	private String student_mother;
	private String student_dob;
	private String student_doj;
	
	private String student_mobile;  
	private String student_address; 
	private String student_class; 
	private String student_class_section;
	
	public Long getStudent_id() {
		return student_id;
	}
	public void setStudent_id(Long student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_father() {
		return student_father;
	}
	public void setStudent_father(String student_father) {
		this.student_father = student_father;
	}
	public String getStudent_mother() {
		return student_mother;
	}
	public void setStudent_mother(String student_mother) {
		this.student_mother = student_mother;
	}
	public String getStudent_dob() {
		return student_dob;
	}
	public void setStudent_dob(String student_dob) {
		this.student_dob = student_dob;
	}
	public String getStudent_doj() {
		return student_doj;
	}
	public void setStudent_doj(String student_doj) {
		this.student_doj = student_doj;
	}
	public String getStudent_mobile() {
		return student_mobile;
	}
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}
	public String getStudent_address() {
		return student_address;
	}
	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}
	public String getStudent_class() {
		return student_class;
	}
	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}
	public String getStudent_class_section() {
		return student_class_section;
	}
	public void setStudent_class_section(String student_class_section) {
		this.student_class_section = student_class_section;
	} 

}
