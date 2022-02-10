package com.capgemini.stringassignment;
//Reverse a string in Java without using the reverse method
public class StringReverse {

		public static void main(String args[]) {
			String a = "java programing";
			char ch[] = a.toCharArray();
			String r = "";
			int l = ch.length;

			for (int i = l - 1; i >= 0; i--) {
				r=r+ch[i];

			}
			System.out.println(r);

		}
	}



