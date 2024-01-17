package com.fundamentals;
/**Instance variables
 * Declared outside the method
 * can we accessed with Object 
 * 
 * Note-- though using object also static variables can be accessed. but not recomonded since Static object is already created with compile time
 * **/
public class Variables_I {

	int a = 10;
	
	public static void main(String[] args) {
		

		Variables_I obj1 = new Variables_I();
		Variables_I obj2 = new Variables_I();
		System.out.println("Variable Before Modifying Obj1: "+obj1.a);
		System.out.println("Variable Before Modifying Obj2: "+obj2.a);
		
		obj2.a = 55;
		System.out.println("Variable Before Modifying Obj1: "+obj1.a);
		System.out.println("Variable Before Modifying Obj2: "+obj2.a);
		
	}

}
