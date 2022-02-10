package com.capgemini.stringassignment;
//check if two strings are anagrams of each other
import java.util.Arrays;
public class Stringanagram 
{


	public static void main(String args[])
		{
			String A="keep";
			String B="peek";
			
			if(A.length() != B.length())
			{
				System.out.println("not anagram");
			}
			else
			{
				char[]ch=A.toLowerCase().toCharArray();
				char[]ch1=B.toLowerCase().toCharArray();
				
				//char ch[]=A.toCharArray();
				//char ch1[]=B.toCharArray();
				//char ch[]=A.toLowerCase();
				//char ch1[]=B.toLowerCase();
				
				Arrays.sort(ch);
				Arrays.sort(ch1);
				
				boolean f=Arrays.equals(ch, ch1);
				
				if(f)
				{
					System.out.println("anagram");
					
				}
				else
				{
					System.out.println("not anagram");
				}
				
				
			}
				
			
		}
}

