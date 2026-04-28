package com.oops;
/*Polymorphism
 * many forms
 * 2 types : Run time polymorphism  ;  Compile time polymorphism
 * 
 */
class Student{
	String name;
	int age;
	
	//METHOD OVERLOAING   ---->   Complie Time Polymorphism
	public void printInfo(String name) {
		System.out.println(name);
	}
	
	public void printInfo(int age) {
		System.out.println(age);
	}
	
	public void printInfo(String name, int age) {
		System.out.println(name+" "+age);
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.printInfo(20);
		s1.printInfo("ram");
		s1.printInfo("ram",20);
	}

}
