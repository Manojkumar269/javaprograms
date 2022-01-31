package com.cagemini.assignments;
import java.util.Scanner;
public class powerofnos {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		System.out.println("enter the power");
		int n=sc.nextInt();
		int x=1;
		for (int i=1;i<=n;i++)
		{
			x=x*a;
		}
		
		System.out.println(x);
		
		
	}

}
