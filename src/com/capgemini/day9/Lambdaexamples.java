package com.capgemini.day9;

interface StringCombine {
	public String combine(String str, String str1);
}

interface StringASCII {
	public void ascii(String a);
}

interface Printnum {
	public void num(int n);
}

interface MyAddition {
	public void add(int a, int b);
}

public class Lambdaexamples {
	public static void main(String args[])
	{
		
		//lambda expression to compine two strings
		StringCombine combine=(str,str1)->(str.concat(str1));
		System.out.println(combine.combine("java", "programming"));		
		
		
		// StringASCII ascii=(a)->a.codePointAt(2);
		// System.out.println(	ascii.ascii("java"));	
		
		
		//lambda to print the series from 1-100
		Printnum num=(n)->
		{
				while(n<=100)
					System.out.println(n++);
			};
			num.num(1);
		}
	
	
	MyAddition sum=(a,b)->
	{
		int c=a+b;
		System.out.println(c);
		
	};

	
	
	
}


