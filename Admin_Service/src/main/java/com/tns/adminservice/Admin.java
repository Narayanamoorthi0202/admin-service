package com.tns.adminservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	private Integer A_userid;
	private String A_username;
	private String A_dept;
	
	public Admin() {
		super();
	}
	
	public Admin(Integer a_userid, String a_username, String a_dept) {
		super();
		A_userid = a_userid;
		A_username = a_username;
		A_dept = a_dept;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getA_userid() {
		return A_userid;
	}
	public void setA_userid(Integer a_userid) {
		A_userid = a_userid;
	}
	public String getA_username() {
		return A_username;
	}
	public void setA_username(String a_username) {
		A_username = a_username;
	}
	public String getA_dept() {
		return A_dept;
	}
	public void setA_dept(String a_dept) {
		A_dept = a_dept;
	}
	@Override
	public String toString()
	{
		return "Admin[Admin userid:"+A_userid+" Admin username"+A_username+" Admin A_dept]";
	}
}
