package com.oops;

interface Animal1{
	//All fields are public static and final by default
	//methods are abstract and public by default
	void walk1();
}

class Horsee implements Animal1{
	public void walk1() {
		System.out.println("walks on 4 legs");
	}
}

interface Herbivore{
	
}
//Multiple inheritance
class Elephant implements Animal1, Herbivore{
	public void walk1() {
		System.out.println("walks on 4 legs");
	}
}

abstract class Animal{
	//may contain constructors and methods
	abstract void walk();
}

class Horse extends Animal{
public void walk(){
		System.out.println("walks on 4 legs");
	}
}
class Chicken extends Animal{
public void walk(){
		System.out.println("walks on 2 legs");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		Horse h=new Horse();
		h.walk();
		
		Horsee h1=new Horsee();
		h1.walk1();

	}

}
