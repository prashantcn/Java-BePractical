package com.fundamentals;
/**
 * Methods
 * Block of code to execute some task
 * code reusibility
 * Static method
 * Non static methods - accessed through Object
 * General methods - Accessed with Class Name
 * return type methods**/
public class Method_I {

	//Method Definition
	public void meth1(){
		System.out.println("Meth1 Execution");
	}
	
	//Method with return type
	public int squre(int num){
		
	//ystem.out.println(num);
		return num*num;
	}
	
	//static method
	static void meth2(){
		System.out.println("Static Method ");
	}
	
	static String meth3(String name){
		return name;
	}
	
	public static void main(String[] args) {
		Method_I meth1Obj = new Method_I();
		meth1Obj.meth1();
		meth1Obj.squre(2);
		int result = meth1Obj.squre(25);
		System.out.println(result);
		Method_I.meth2();
		System.out.println();
		
		
	}

}
