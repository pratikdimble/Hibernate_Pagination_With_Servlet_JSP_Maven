package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_FORM")
public class Student {
	
	private int sid;
	private String sname;
	private String semail;
	private String sresult;
	
	@Id
	@Column(name="ID",length=10)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Column(name="Name")
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Column(name="EMail")
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	@Column(name="Result")
	public String getSresult() {
		return sresult;
	}
	public void setSresult(String sresult) {
		this.sresult = sresult;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sresult=" + sresult + "]";
	}
	
	

}
