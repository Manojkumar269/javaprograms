package com.capgemini.day5;
//Count the number of words in a given string sentence?
public class stringcount {
	
	public static void main(String args[])
	{
		String str="I like java programing";
		int count=1;
		int l=str.length();
		for(int i=0;i<l-1;i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
