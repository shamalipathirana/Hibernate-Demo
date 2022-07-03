package com.sha.demohb;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	@Id
	private int subjectId;
	private String SubjectName;

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return SubjectName;
	}

	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", SubjectName=" + SubjectName + "]";
	}

}
