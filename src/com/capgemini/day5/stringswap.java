package com.capgemini.day5;
//swap two strings without using the third variable
public class stringswap {
public static void main(String args[])
{
	String a="hello";
	String b="java";
	
	System.out.println("before swap "+a+" "+b);
	a=a+b;
	
	b=a.substring(0,a.length()-b.length());
	a=a.substring(b.length());
	
	System.out.println("after swap "+a+" "+b);
}
}
