package com.create.strings;
import java.util.Scanner;
public class UnicodeOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=scan.next().charAt(0);
		int unicode=ch;
		System.out.println("The unicode value of "+ch+"is"+unicode);
	}

}


