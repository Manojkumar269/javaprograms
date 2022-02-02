package com.capgemini.day5;

/*String is used to store the string value
   - it is immutable
   - it is not thread safe

   StringBuffer is used to store the string value
	- not immutable
	- not thread safe
    
   StringBuilder is used to store the string value 
	- not immutable
	- thread safe */

public class StringBufferBuilder {

	public static void main(String args[])
	{
		
		// STRING
		String str= "Hello";
		str=str.concat(" Java");
		System.out.println(str);
		
		
		//STRINGBUFFER
		StringBuffer sbf= new StringBuffer("Hello");
		
		sbf.append(" Java"); //to add
		System.out.println(sbf);
		
		sbf.delete(2, 6);
		System.out.println(sbf);
		
		
		//STRINGBUILDER
		StringBuilder sb=new StringBuilder("Hi Hello");
     
        sb.append(" Java");
        System.out.println(sb);
	}
		
		
		
	}

