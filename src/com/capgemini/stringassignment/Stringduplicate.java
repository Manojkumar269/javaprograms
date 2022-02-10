package com.capgemini.stringassignment;
//Print duplicate characters from the string?
public class Stringduplicate {
	public static void main(String args[])
	{
		String a="java programing";
		char ch[]=a.toCharArray();
		int count =1;
		int l=a.length();
		
		for(int i=0;i<l;i++)
		{
			for(int j=i+1;j<l;j++)
			{
				if(ch[i] == ch[j])
				{
					count++;
					
				}
			}
			if(count>1)
				
		
		System.out.println(ch[i]);
	}
	}
}
