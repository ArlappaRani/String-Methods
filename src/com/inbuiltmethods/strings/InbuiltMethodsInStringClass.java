package com.inbuiltmethods.strings;

public class InbuiltMethodsInStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//creating a string
		String s1="KodNest Technologies Pvt Ltd";
		
		//to print upper case
	System.out.println(s1.toUpperCase());
	    //to print lower case of string
	System.out.println(s1.toLowerCase());
	   //Check the string starts with substring
	
	System.out.println(s1.startsWith("Kod"));//true
	System.out.println(s1.startsWith("Python"));//false
	
	   //check the string ends with substring 
	System.out.println(s1.endsWith("Ltd"));//true
	System.out.println(s1.endsWith("Pvt"));//false
	
	  //check the main string is contain substring
	System.out.println(s1.contains("Tech"));//true
	System.out.println(s1.contains("Mech"));//false
	
	  //print the index of particular character in string
	System.out.println(s1.indexOf('N'));//3
	System.out.println(s1.indexOf('o'));//1
	System.out.println(s1.indexOf('j'));//out of character (-1)
	 
	//print the last index of particular character in string
	System.out.println(s1.lastIndexOf('t'));//26
	System.out.println(s1.lastIndexOf('o'));//15
	
	//print the character of particular index
	System.out.println(s1.charAt(6));//t
	System.out.println(s1.charAt(7));//space
	
	//print the characters from given index until last index
	System.out.println(s1.substring(5));//st Technologies Pvt Ltd
	System.out.println(s1.substring(9));//echnologies Pvt Ltd
	
	//here will giving the start and end index to print characters 
	//it print character stars from to last index -1
	System.out.println(s1.substring(5,15));//st Technol
	   
	
		
	}

}
