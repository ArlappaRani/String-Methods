package com.inbuiltmethods.strings;
import java.util.Scanner;
public class ReplacingSubstringsAndCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		//Replacing the string 
		String newstr=str.replace("Java" ,"Python" );
		System.out.println(newstr);  
		//Replacing the character
		String newstr1=str.replace('a','0');
		System.out.println(newstr1); 

	}

}
