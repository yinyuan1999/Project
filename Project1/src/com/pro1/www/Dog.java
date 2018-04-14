package com.pro1.www;

public class Dog extends Pet implements Swim{
	public void run() {
		System.out.println("gou pao");
	}
	public void call() {
		System.out.println("wangwang");
	}
	public void swim() {
		System.out.println(name+"can swim");
	}

}
