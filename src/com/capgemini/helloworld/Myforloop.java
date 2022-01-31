package com.capgemini.helloworld;

public class Myforloop {

	public static void main(String args[])
	{
		int i;
		for( i=0;i<=20;i++)
		{
			if( i %2 == 0)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}
