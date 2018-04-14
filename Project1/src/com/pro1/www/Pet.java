package com.pro1.www;

public class Pet {
	 String name;
	 int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void run() {
		System.out.println(name+"can run");
	}
	public void call() {
		
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
