package com.sha.demohb;

public class Student {

	private int studentId;
	private String name;
	private String studentSubject;

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentSubject() {
		return studentSubject;
	}

	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", studentSubject=" + studentSubject + "]";
	}

}
