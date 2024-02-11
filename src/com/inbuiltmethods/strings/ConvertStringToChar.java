package com.inbuiltmethods.strings;
import java.util.Scanner;
public class ConvertStringToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		//converting string to character
		char[]arr=str.toCharArray();
		//printing the elements in array
		for(char x:arr)
		{
			System.out.print(x+" ");
		}
		

	}

}
