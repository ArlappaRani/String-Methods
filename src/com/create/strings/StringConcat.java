package com.create.strings;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		System.out.println(s1);//JAVA
		//concatenating new value to s1
		s1.concat("TECH");
		//after concatenation also the value not modified or changed 
		//iN string pool s1 address will not point the new value 
		//for same variable the value not changed
		System.out.println(s1);//JAVA
		

	}

}
