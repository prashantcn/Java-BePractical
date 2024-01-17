package com.fundamentals;

public class Operators {
	
	public void shiftOperator(){
		int x = 10;
		System.out.println(x<<1);
		System.out.println(x<<2);
		System.out.println(x>>1);
		System.out.println(x>>2);
	}

	public static void main(String[] args) {
		
		Operators obj  = new Operators();
		obj.shiftOperator();
		
	}

}
