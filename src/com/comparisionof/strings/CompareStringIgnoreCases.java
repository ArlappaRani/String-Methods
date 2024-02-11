package com.comparisionof.strings;

public class CompareStringIgnoreCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a strings

		//creating  string in string pool
		 String s1="JAVA";
		//creating strings in outside string pool 
		 String s2=new String("Java");
		//compare address of strings using equal to operator
		 //inside and outside string pool address will be different
		if(s1==s2)
		 {
		  System.out.println("References are equal"); 
		 }
		else
		 {
		 System.out.println("References are not equal");
		 }
		//Compare the values of strings using equals() method
		//Values are not  equal because both strings cases are different
		 if(s1.equals(s2))
		 {
		 System.out.println("Values are equal"); 
		 }
		 else
		 {
		 System.out.println("Values are not equal");
		 }
		 //Comparing the String values by ignoring cases
		 if(s1.equalsIgnoreCase(s2))
		 {
		 System.out.println("Values are equal after ignoring the cases"); 
		 }
		 else
		 {
		 System.out.println("Values are not equal");
		 }
						
		
  		

	}

}
