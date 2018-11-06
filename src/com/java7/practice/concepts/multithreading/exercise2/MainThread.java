package com.java7.practice.concepts.multithreading.exercise2;

public class MainThread {
	
	public static void main(String[] args) {
		Runnable r = new ChildThread();
		Thread t = new Thread(r);
		t.start();
		System.out.println("Executing Main thread :: "+Thread.currentThread().getName());
		for(int i =0; i < 100; i++){
			System.out.println("Main Thread :: "+i);
		}
	}
}
