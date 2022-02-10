package com.capgemini.day9;

interface Mysum{
	public void add(int a, int b);
}

interface Myoddeven
{
	public void value(int x);
}
interface Myvalue
{
	public void num(int n);
}

interface Mynumber
{
	public void positiveornegative(int i);
}

interface Mysquare
{
	public void square(int m);
}

interface MyUpper
{
	public String string(String str);
}

interface Mylength
{
	public void length(String str1);
}

public class Mylambda {
	public static void main(String args[])
	{
		//create Lambda to pass String and return in Upper case
		MyUpper string=(str)->str.toUpperCase();
		{
			System.out.println(string.string("i am doing java programing"));
		};
		
		
		
		
		//Create Lambda to pass string and return the length of String
		Mylength length=(str1)->
		{
			int l= str1.length();
			System.out.println("length of string is "+l);
		};
		length.length("java programing");
		
		
		
		//Create Lambda to return square of given number
		Mysquare square=(m)->
		{
			int n=m*m;
			System.out.println("Square of "+m +" = " +n);
		};
		square.square(5);
		
		
		
		//Create Lambda for Find Given Number is positive or Negative
		Mynumber positiveornegative =(i)->
		{
			if(i>0)
			{
				System.out.println("positive "+i);
			}
			else
			{
				System.out.println("negative "+i);
			}
		};
		positiveornegative.positiveornegative(5);
		
		
		
		//lambda to find the sum
		Mysum sum=(a,b)->
		{
			int c=a+b;
			System.out.println(c);
			
		};
		sum.add(10,10);
		
		
		
		//lambda to find whether the number is odd or even
		Myoddeven value=(x)->
		{
			if(x%2==0)
			{
				System.out.println("even "+x);
			}
			else
			{
				System.out.println("odd "+x);
			}
		};
		value.value(50);
	
		
		
		//lambda to print the given value
		Myvalue num= (n)->
		{
			System.out.println(n);
			
		};
		num.num(70);
	}
	
	
	

	
}













