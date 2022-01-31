package com.cagemini.assignments;
import java.util.Scanner;
public class averageofnos {
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter total numbers");
		int n=sc.nextInt();
		System.out.println("enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int d= (a+b+c)/n;
		System.out.println("the average is "+d);
	}

}
