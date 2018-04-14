package com.pro1.www;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Pet> petList = new ArrayList<>();
		Pet cat = new Cat();
		Pet dog = new Dog();
		petList.add(cat);
		petList.add(dog);
		for(Pet pet : petList) {
			pet.call();
			pet.run();
			if(pet instanceof Cat) {
				((Cat) pet).catchMouse();
			}
			if(pet instanceof Dog) {
				((Dog) pet).swim();
			}
		}
		GirlFriend gf1 = new GirlFriend(cat);
		GirlFriend gf2 = new GirlFriend(dog);
		
		((Cat)gf1.getPet()).catchMouse();
		((Dog)gf2.getPet()).swim();
		
	}


		
	}
	
