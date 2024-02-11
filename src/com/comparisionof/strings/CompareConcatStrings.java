package com.comparisionof.strings;

public class CompareConcatStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a strings

				//creating  string in string pool
				 String s1="JAVA";
				 String s2="SQL";
				//creating strings concatenating the values
				//Strings are created inside string pool 
				 String s3="JAVA"+"SQL";
				 String s4="JAVA"+"SQL";
				//compare address of strings using equal to operator
				 //inside string pool address will be same
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
