package com.lksoulman.dubbo.api.domain;

import java.io.Serializable;

/**
 * 
 * @author chengyz
 *
 */
public class User implements Serializable {

	private static final long serialVersionUID = -4190340626900549927L;
	
	private int id;
	private int age;
	private int sex;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
