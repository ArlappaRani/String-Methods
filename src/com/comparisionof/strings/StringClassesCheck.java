package com.comparisionof.strings;

public class StringClassesCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a strings
		/*both strings memory will be inside string pool where 
		duplicates are not allowed and same address will be given to two strings*/
		String s1="Java";
		String s2="Java";
		//check address of strings using equal to operator
		if(s1==s2)
		{
			System.out.println("References are equal"); 
		}
		else
		{
			System.out.println("References are not equal");
		}
		//Checking the values of strings using equals() method
		if(s1.equals(s2))
		{
			System.out.println("Values are equal");
		}
		else
		{
			System.out.println("values are not equal");
		}

	}

}
