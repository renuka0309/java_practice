package com.oops;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("writing");
	}
	
	public void printColor() {
		System.out.println(this.color);
	}
}

public class ClassDemo {

	public static void main(String[] args) {
		Pen p=new Pen();
		
		p.color="blue";
		p.type="gel";
		
		p.write();
		
        Pen p1=new Pen();
		
		p1.color="black";
		p1.type="gel";
		
		p.printColor();
		p1.printColor();
		
	}

}
