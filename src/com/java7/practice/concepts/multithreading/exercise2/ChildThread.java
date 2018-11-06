package com.java7.practice.concepts.multithreading.exercise2;

public class ChildThread implements Runnable{
	/*
	public void start(){
		System.out.println("Executing start of child class");
	}
*/
	@Override
	public void run() {
		System.out.println("Executing Thread :: "+Thread.currentThread().getName());
		for(int i = 0; i < 100; i++){
			System.out.println("Child Thread :: "+i);
		}
	}
}
