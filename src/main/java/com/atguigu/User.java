package com.atguigu;

public class User {
	private String name = "褚江江";
	private String add;
	private int age;

	public User() {
		super();
		System.out.println("春江潮水连海平,海上明月共潮生!");
		System.out.println("即食水蜜桃");
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
