package com.fundamentals;

public class TypeCasting {

	public static void main(String[] args) {
	
		System.out.println("Lower to Higher : Implicit Type casting");
		byte a= 10;
		int b = a;

		System.out.println("Higher to Lower : Explicit Type casting");
		int x = 200;
		byte y = (byte)x;
		System.out.println(y);
	}

}
