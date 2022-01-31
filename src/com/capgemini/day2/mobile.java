package com.capgemini.day2;

class phone {

	private int price;
	private float size;
	private String brand;

	phone(int price, float size, String brand) {
		this.price = price;
		this.size = size;
		this.brand = brand;

	}

	public void printdetails() {
		System.out.println("price= " + price);
		System.out.println("size= " + size);
		System.out.println("brand= " + brand);

	}

	public class mobile {

		public static void main(String args[]) {
			phone p1 = new phone(10000, 5.6f, "Realme");

			p1.printdetails();
		}
	}
}
