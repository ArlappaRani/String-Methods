package com.create.strings;

public class ConcatAndCheckStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="JAVA";
		System.out.println("Before concatenation"+s1);
		String s2=s1.concat("TECH");
		System.out.println("After concatenation"+s2);
		String s3="JAVATECH";
		if(s2==s3)
		{
			System.out.println("It is Inside string pool");
		}
		else
		{
			System.out.println("It is present outside String pool");
		}

	}

}
