package com.capgemini.day3;


class shape
{
	public void drwashape() {
		System.out.println("Shape");
	}
}

class line
{
	public void drwashape() {
		System.out.println("line");
	}
}
class circle
{
	public void drwashape() {
		System.out.println("circle");
	}
}
public class polymorphism {
	public static void main(String args[])
	{
		line s=new line();
		s.drwashape();
	}

}
