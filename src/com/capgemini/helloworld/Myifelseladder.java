package com.capgemini.helloworld;
import java.util.Scanner;
public class Myifelseladder {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		
		if(a==1)
		{
			System.out.println("mon");
		}
		else if(a==2)
		{
			System.out.println("tues");
		}
		else if(a==3)
		{
			System.out.println("wed");
			
		}
		else if(a==4)
		{
			System.out.println("thurs");
		}
		else if(a==5)
		{
			System.out.println("fri");
		}
		else if(a==6)
		{
			System.out.println("sat");
		}
		else if(a==7)
		{
			System.out.println("sun");
			
		}
		else
		{
			System.out.println("unknown day");
		}
		
		
		
		
	}

}
