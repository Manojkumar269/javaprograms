package com.capgemini.stringassignment;

//check if a string is a palindrome
public class Stringpalindrome {
	public static void main(String args[])
	{
	String str="malayalam";
	int l=str.length();
	int i=0;
	int j=l-1;
	int f=0;
	
	while(i<j)
	{
	if(str.charAt(i) != str.charAt(j))
	{
		
		f=1;
		break;
		
	}
	else
	{
		i++;
		j--;
	}
	}
	if(f==1)
	{
		System.out.println("not palindrome");
	}
	
	else
	{
		System.out.println("palindrome");
	}
	
	}
}

