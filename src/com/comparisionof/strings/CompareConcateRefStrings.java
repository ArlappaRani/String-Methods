package com.comparisionof.strings;

public class CompareConcateRefStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a strings

		//creating  string in string pool
		 String s1="JAVA";
		 String s2="SQL";
		//creating strings concatenating the references
		//Strings are created outside string pool because new string is creating
		 String s3=s1+s2;
		 String s4=s1+s2;
		//compare address of strings using equal to operator
		 //outside string pool address will be different
		if(s3==s4)
		 {
		  System.out.println("References are equal"); 
		 }
		else
		 {
		 System.out.println("References are not equal");
		 }
		//Compare the values of strings using equals() method
	
		 if(s3.equals(s4))
		 {
		 System.out.println("Values are equal"); 
		 }
		 else
		 {
		 System.out.println("Values are not equal");
		 }	
		

	}

}
