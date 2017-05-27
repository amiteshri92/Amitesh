package com.coding1;

public class ConstructorQuestion {

	public ConstructorQuestion(double[] a){
		System.out.println("double");
	}
	
	public ConstructorQuestion(Object o){
		System.out.println("object");
	}
	
//	public ConstructorQuestion(String s){
//		System.out.println("string");
	//adding comment
//	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		new ConstructorQuestion(null);
	}
	
}
