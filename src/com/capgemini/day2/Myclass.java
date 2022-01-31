package com.capgemini.day2;

class mobile
{
	private int price;
	private String brand;
	private String colour;
	
	mobile(int price,String brand,String colour)
	{
		this.price=price;
		this.brand=brand;
		this.colour=colour;
		
	}
	
	public void printdetails()
	{
		System.out.println("price="+price);
		System.out.println("brand="+brand);
		System.out.println("colour="+colour);
		
	}
	
}

class student
{
	private int rollno;
	private String name;
	private int mark;
	
	student(int rollno,String name,int mark)
	{
		this.rollno=rollno;
		this.name=name;
		this.mark=mark;
		
	}
	
	public void printdetails()
	{
		System.out.println("rollno="+rollno);
		System.out.println("name="+name);
		System.out.println("mark="+mark);
		
	}
	
}

public class Myclass
{
	public static void main(String args[])
	{
		mobile phone1= new mobile(10000,"samsung","blue");
		phone1.printdetails();
		mobile phone2= new mobile(15000,"redmi","black");
		phone2.printdetails();
		student name= new student(18101,"manoj",85);
		name.printdetails();
	}
	
}











































