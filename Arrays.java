package com.coreJava;
class Students{
	int id;
	String name;
	
	Students(int id,String name){
		this.id=id;
		this.name=name;
	}
}
public class Arrays {
  public static void main(String args[]) {
	  //creating and traversing of an array
	  
	  int arr[]= {1,2,3,5};
	  for(int num: arr) {
		  System.out.print(num+" ");
	  }
	  System.out.println();
	  int[] arr1= {10,20,30,40,50};
	  for(int num: arr1) {
		  System.out.print(num+" ");
	  }
	  System.out.println();
	  
	  //accessing arrays
	  
	  System.out.println(arr[3]);
	  System.out.println(arr1[0]);
	  
	  //accessing an element
	  
	  int res=arr[2]=18;
	  System.out.println(res);
	  
	  //traversing arrays
	  
	 //ARRAY OF OBJECTS 
	  Students[] arr2=new Students[2];
	  
	  arr2[0]=new Students(1,"Renu");
	  arr2[1]=new Students(2,"Nitya");
	  for(int i=0;i<arr2.length;i++) {
		  System.out.println(arr2[i].id+" "+arr2[i].name);
	  }
  }
}
