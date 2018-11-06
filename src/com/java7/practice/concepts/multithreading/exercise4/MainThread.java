package com.java7.practice.concepts.multithreading.exercise4;

public class MainThread {
	
	public static void main(String[] args) {
		System.out.println("Thread name :: "+Thread.currentThread().getName()+"Thread Priority :: "+Thread.currentThread().getPriority());
		Runnable r = new ChildThread();
		Thread t = new Thread(r,"Child Thread - 0");
		t.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("Main thread :: "+i);
		}
	}

}
