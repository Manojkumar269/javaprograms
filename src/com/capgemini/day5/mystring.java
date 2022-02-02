package com.capgemini.day5;

public class mystring {
	public static void main(String args[])
	{
		String str = new String("Hello String");
		String str1= "Hello Java";
		String str2= new String();
		
		//to find the length of the string
		System.out.println(str.length());
		
		//to check whether the string is empty or not
		if(str2.isEmpty())
		{
			System.out.println("The string is empty");
		}
		else
		{
			System.out.println("The string is not empty");
		}
		
		//to return the location of the character
		System.out.println(str.charAt(0));
		System.out.println(str1.charAt(6));
		
		//to return the ASCII value of the character
		System.out.println(str.codePointAt(0));
		
		//it is used to compare two Strings
		//and (.equalIgnoreCase will ignore the case sensitivity and then compare
		if(str.equals(str1))
	      {
	    	  System.out.println("Both are equal");
	      }
	      else
	      {
	    	  System.out.println("Both are not equal");
	      }
		
		//compareTo - compares and returns the difference between the ASCII value 
		String str3="a";
		String str4="F";
		
		System.out.println(str3.compareTo(str4));
		System.out.println(str4.compareTo(str3));
		
		//to lower case the String
		System.out.println(str.toLowerCase());
		
		
		//to upper case the String
		System.out.println(str.toUpperCase());
		
		// str.trim - to remove the extra spaces at the start and end of the String
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
