package com.compareTo.stringmethod;

public class CompareDifferentLengthsofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking two strings
				String str1="RAM";//length=3
				String str2="RAMA";//length=4
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

