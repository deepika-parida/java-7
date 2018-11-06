package com.java7.practice.concepts;

public class Calculator {
	
	
	public void display(Object l){
		System.out.println("Autoboxing");
	}
	
	public void display(int...x){
		System.out.println("Var args");
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.display(10);
	}

}
