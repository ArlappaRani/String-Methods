package com.inbuiltmethods.strings;
import java.util.Scanner;
public class SplitMethodOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		//dividing the strings and storing in string type of array
		String []arr=str.split(" ");
		//printing each element in array
		for(String x:arr)
		{
			System.out.println(x);
		}

	}

}
