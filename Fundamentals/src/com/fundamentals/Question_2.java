package com.fundamentals;
/**
 * Write a program to find the simple interest**/
public class Question_2 {
	
	public float simpleInt(){
		float principle, interest, tenure;
		principle = 100000f;
		interest = 12f;
		tenure = 12f;
		
		return (principle*interest*tenure)/100;
	}

	public static void main(String[] args) {
		Question_2 simpleIntObj = new Question_2();
		float totalInterest = simpleIntObj.simpleInt();
		System.out.println("Simple Interest: "+totalInterest);

	}

}
