package com.myProject.SpringMVC.model;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1214988621599209906L;
	private int id;//用户id
	private String name;//用户姓名
	private String sex;//用户性别
	private String email;//用户email
	private int age;//用户年龄
	private int mobilephone;//用户手机号码
	private String manager;//职位
	public Person(){
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(int mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	
}

