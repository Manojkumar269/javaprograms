package com.capgemini.stringassignment;
//swap two strings without using the third variable
public class Stringswap {
	
	
	public static void main(String args[])
	{
		String a="hello";
		String b="java";
		
		System.out.println("before swap: "+a+" "+b);
		a=a+b;
		int l=a.length()-b.length();
		b=a.substring(0,l);
		a=a.substring(b.length());
		
		System.out.println("after swap: "+a+" "+b);
	}
	}


