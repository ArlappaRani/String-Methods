package com.comparisionof.strings;

public class CreateStringusingNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a strings
		/*both strings memory will be outside string pool where 
	duplicates are  allowed and different address will be given to two string variables*/
	  String s1=new String("JAVA");
	  String s2=new String("JAVA");
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
		System.out.println("Values are not equal");
		}
			

	}

}
