package com.sha.demohb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@Column(name = "role_no")
	private int roleNo;
	@Column(name = "name")
	private String userName;
	private int marks;

	public int getRoleNo() {
		return roleNo;
	}

	public void setRoleNo(int roleNo) {
		this.roleNo = roleNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "User [roleNo=" + roleNo + ", userName=" + userName + ", marks=" + marks + "]";
	}

}
