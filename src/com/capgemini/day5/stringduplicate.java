package com.capgemini.day5;

public class stringduplicate {
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
		}
	}
}

	//String a = "Java Programing";  
    // int count;  
    
        
   /* char[] ch = a.toCharArray();
    
    for(int i = 0; i <string1.length(); i++) 
    {  
        count = 1;  
        for(int j = i+1; j <string.length; j++) {  
            if(string[i] == string[j] && string[i] != ' ') {  
                count++;  
              
                string[j] = '0';  
            }  
        }  
        if(count > 1 && string[i] != '0')  
            System.out.println(string[i]);  
    }  
}  
*/
