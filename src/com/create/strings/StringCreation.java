package com.create.strings;

public class StringCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a string using string class and new keyword
		//s1 string stored in inside the string pool
		String s1="KodNest";
		//s2 string stored in outside the string pool 
		String s2=new String("Kodnest");
		//s3 string stored in inside the string pool
		String s3="KodNest";
		//s4 string stored in inside the string pool
		String s4=new String("kodNest");
		//Printing a strings
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);



	}

}
