package com.fundamentals;

public class Question_I {

	int data = 100;
	static int data2 = 200;
	
	public void m1(){
		int data3 = 300;
		System.out.println("Local variable Data2: "+data3);
	}
	public static void main(String[] args) {
		
		Question_I objQ1 = new Question_I();
		
		System.out.println("Instance variable data "+objQ1.data);
		System.out.println("Static variable Data2: "+Question_I.data2);
		objQ1.m1();
	}
	

}
