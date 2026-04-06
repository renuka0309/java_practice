package com.vstand4u;
//class outside the main class
class school{
	String sch_nm="KLE Society's School";
}

//main class
public class Students {
//main method
	public static void main(String args[]) {
	 school st = new school();
	 System.out.println(st.sch_nm);
 }
}
