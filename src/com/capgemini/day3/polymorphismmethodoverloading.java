package com.capgemini.day3;

class myshape{
	public void draw(int a) {
		System.out.println("line");
		
	}
	public void draw(int a, int b) {
		System.out.println("circle");
	}
	public void draw(int a, int b, int c) {
		System.out.println("square");
	}
}
public class polymorphismmethodoverloading {
	public static void main(String args[])
	{
		myshape sp=new myshape();
		sp.draw(1,1,5);
		sp.draw(1);
		
	}

}
