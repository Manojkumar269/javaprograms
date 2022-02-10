package com.capgemini.assignmentsarray;
//sum of all the element of array *
//Avg of all the element of array *

import java.util.*;
public class sumofarray {

	public static void main(String args[])
	{
		
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=c.nextInt();
		int arr[]=new int[n];
		
		int sum=0;
	    Scanner sc= new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum= sum+arr[i];
			
		}
		int avg=sum/3;
		System.out.println("Sum of the array elements = "+sum);
		System.out.println("Average of the array elements = "+avg);
	}
}
