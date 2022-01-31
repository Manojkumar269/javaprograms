package com.cagemini.assignments;

public class complexnos {
	
		 
		   double real, img;
			
		
		   complexnos(double r, double i){
			this.real = r;
			this.img = i;
		   }
			
		   public static complexnos sum(complexnos c1, complexnos c2)
		   {
			
			   complexnos temp = new complexnos(0, 0);

		        temp.real = c1.real + c2.real;
		        temp.img = c1.img + c2.img;
		        
		        return temp;
		    }
		    public static void main(String args[]) {
		    	complexnos c1 = new complexnos(5.5, 4);
		    	complexnos c2 = new complexnos(1.2, 3.5);
		    	complexnos temp = sum(c1, c2);
		        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
		    }
		}
