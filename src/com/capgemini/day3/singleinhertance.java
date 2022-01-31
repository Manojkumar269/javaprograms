package com.capgemini.day3;


class A{
	
	
	public void printA()
	{
		int a=
		
		System.out.println("I am class A");
	}
}

class B extends A
{
	public void printB()
	{
		System.out.println("I am class B");
	}
}
public class singleinhertance {
	
	public static void main(String args[])
	{
		B b=new B();
		b.printB();
		b.printA();
    
	
}}
