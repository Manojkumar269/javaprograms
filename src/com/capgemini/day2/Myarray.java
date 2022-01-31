package com.capgemini.day2;
import java.util.Scanner;
public class Myarray {

	public static void main(String args[])
	{
		String a[]=new String[5];
		int b[]=new int[5];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the value for "+i);
			a[i] = sc.next();
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}
