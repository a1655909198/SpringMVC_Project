package com.myProject.SpringMVC.model;

import java.io.Serializable;

public class Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1214988621599209906L;
	private int id;//�û�id
	private String name;//�û�����
	private String sex;//�û��Ա�
	private String email;//�û�email
	private int age;//�û�����
	private int mobilephone;//�û��ֻ�����
	private String manager;//ְλ
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

