package com.create.strings;

public class StringConcatUsingNewobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		System.out.println(s1);//JAVA
		//concatenating new value to s2 then only the value changes
		String s2=s1.concat("TECH");
	
		System.out.println(s1);//JAVA
		System.out.println(s2);//JAVATECH
		


	}

}
