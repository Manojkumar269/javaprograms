package com.capgemini.day5;

public class stringoccurancecount {

	public static void main(String args[])
	{
		String str= "aaaababajvmnksa";
		char o='a';
		int count=1;
		for(int i=0; i<(str.length())-1;i++)
		{
			if(str.charAt(i)== o)
			{
				count++;
			}
		}
		System.out.println("the count of char "+o+" is "+count);
	}
}
