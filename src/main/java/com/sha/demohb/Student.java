package com.sha.demohb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name = "student_id")
	private int studentId;
	// @Column(name = "student_name")
	// private String name;

	private StudentFullName sName;

	public StudentFullName getfName() {
		return sName;
	}

	public void setfName(StudentFullName fName) {
		this.sName = fName;
	}

	@Column(name = "subject_name")
	private String subjectName;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", sName=" + sName + ", subjectName=" + subjectName + "]";
	}

}
