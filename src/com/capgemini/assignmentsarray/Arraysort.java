package com.capgemini.assignmentsarray;
//sort the array element
import java.util.*;
public class Arraysort {

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		int n= sc.nextInt();
		int[] arr=new int[n];
		 
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		int t;
		
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if (arr[j]<arr[i])
				{
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		System.out.println("sorted array is: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
