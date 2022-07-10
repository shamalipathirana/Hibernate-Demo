package com.sha.demohb;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Child {
	
	@Id
	private int cid;
	private String cName;
	
	@OneToMany(mappedBy = "child")
	private Collection<Subject> subjectList = new ArrayList<Subject>();
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public Collection<Subject> getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	@Override
	public String toString() {
		return "Child [cid=" + cid + ", cName=" + cName + "]";
	}
	
	

}
