package com.java7.practice.concepts.multithreading.exercise1;

public class MainThread {
	
	public static void main(String[] args) {
		ChildThread t = new ChildThread("Child Thread-0");
		t.start();
		System.out.println("Thread executing :: "+ Thread.currentThread().getName());
		for(int i =0; i < 100;i++){
			System.out.println("Main Thread :: "+i);
		}
	}
}
