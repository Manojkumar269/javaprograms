package com.capgemini.day5;

public class stringanagrams {

	public static void main(String args[])
	{
		String A="peek";
		String B="keep";
		
		if(A.length() != B.length())
		{
			System.out.println("not anagram");
		}
		else
		{
			char[]arrayA=A.toLowerCase().toCharArray();
			char[]araryB=B.toLowerCase().toCharArray();
		}
			 if (areAnagram(A,B))
		            System.out.println(
		            "The two strings are" +
		            "anagram of each other");
		        else
		            System.out.println(
		            "The two strings are not" +
		            " anagram of each other");
			
		
	}
}
