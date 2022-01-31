package com.capgemini.helloworld;

public class Findoddorevenwithrange {

	public static void main(String args[])
	{
		
		for(int i=0;i<=100;i++)
		{
			
		if(i == 20)
		{
			break;
		}
			if(i%2 == 0)
			{
				System.out.println("even " +i );
			}
			
			else
			{
				System.out.println("odd "+i );
			}
		}
	}
}
