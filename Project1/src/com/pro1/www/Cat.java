package com.pro1.www;

public class Cat extends Pet implements CatchMouse{
	public void run() {
		System.out.println("mao pao");
	}
	public void call() {
		System.out.println("miaomiao");
	}
	
	public void catchMouse() {
		System.out.println(name+"can catch mouth");
	}

}
