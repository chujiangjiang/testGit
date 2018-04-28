package com.atguigu;

public class User {
	private String name;
	private String add;
	private int age;

	public User() {
		super();
	}

	public User(String name, String add, int age) {
		super();
		this.name = name;
		this.add = add;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
