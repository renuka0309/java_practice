package com.vstand4u;

public class Student {
  int age=10;
  String name="Renu";
  public static void main(String args[]) {
	  Student s = new Student();
	  System.out.println("Age: "+s.age);
	  System.out.println("Name: "+s.name);
	  System.out.println("===================");
	  System.out.println(s.age);
	  System.out.println(s.name);
	  System.out.println("===================");
	  System.out.println("Age: "+s.age+" "
	  		+ "Name: "+s.name);
  }
}
