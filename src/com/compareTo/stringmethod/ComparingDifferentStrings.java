package com.compareTo.stringmethod;

public class ComparingDifferentStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking two strings
		String str1="SACHIN";
		String str2="SOURAV";
		//creating a new variable 
		int res=str1.compareTo(str2);
		//checking the conditions
		if(res>0)
		 {
			System.out.println("str1 is greater ");
		 }
		else if(res<0)
		 {
			System.out.println("str2 is greater");
		 }
		//checking if res is 0
		else
		 {
			System.out.println("Both str1 and str2 are equal");
		 }		

	}

}
