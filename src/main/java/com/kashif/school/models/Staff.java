package com.kashif.school.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	
	private Long staff_id;
	private String staff_name;
	private String staff_dob;
	private String staff_doj;

	@Id
	private String staff_mobile;
	private String staff_designation;
	private String staff_edu;
	private String staff_address;
	private String staff_subjects;
	private String staff_class;
	private String staff_class_teacher;
	
	public String getStaff_class_teacher() {
		return staff_class_teacher;
	}
	public void setStaff_class_teacher(String staff_class_teacher) {
		this.staff_class_teacher = staff_class_teacher;
	}
	public Long getStaff_id() {
		return staff_id;
	}
	public void setStaff_id(Long staff_id) {
		this.staff_id = staff_id;
	}
	public String getStaff_name() {
		return staff_name;
	}
	public void setStaff_name(String staff_name) {
		this.staff_name = staff_name;
	}
	public String getStaff_dob() {
		return staff_dob;
	}
	public void setStaff_dob(String staff_dob) {
		this.staff_dob = staff_dob;
	}
	public String getStaff_doj() {
		return staff_doj;
	}
	public void setStaff_doj(String staff_doj) {
		this.staff_doj = staff_doj;
	}
	public String getStaff_mobile() {
		return staff_mobile;
	}
	public void setStaff_mobile(String staff_mobile) {
		this.staff_mobile = staff_mobile;
	}
	public String getStaff_designation() {
		return staff_designation;
	}
	public void setStaff_designation(String staff_designation) {
		this.staff_designation = staff_designation;
	}
	public String getStaff_edu() {
		return staff_edu;
	}
	public void setStaff_edu(String staff_edu) {
		this.staff_edu = staff_edu;
	}
	public String getStaff_address() {
		return staff_address;
	}
	public void setStaff_address(String staff_address) {
		this.staff_address = staff_address;
	}
	public String getStaff_subjects() {
		return staff_subjects;
	}
	public void setStaff_subjects(String staff_subjects) {
		this.staff_subjects = staff_subjects;
	}
	public String getStaff_class() {
		return staff_class;
	}
	public void setStaff_class(String staff_class) {
		this.staff_class = staff_class;
	}
	

}
