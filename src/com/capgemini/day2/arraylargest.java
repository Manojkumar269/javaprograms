// Java Program to Find Largest Element of an Array //
package com.capgemini.day2;
import java.util.Scanner;
public class arraylargest {
	
	public static void main(String args[])
	{
		int i;
		int a[]= new int[5];
		Scanner sc= new Scanner(System.in);
		a[i]= sc.next();
		
		
		for (int i = 0; i < 5; i++)   
        {  
            for (int j = i + 1; j < 5; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
	}

}
