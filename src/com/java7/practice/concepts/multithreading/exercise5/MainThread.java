package com.java7.practice.concepts.multithreading.exercise5;

public class MainThread {
	
	public static void main(String[] args) {
		Runnable r = new ChildThread();
		Thread t = new Thread(r,"Child Thread-0");
		ChildThread.t = Thread.currentThread();
		t.start();
		t.interrupt();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("Main Thread :: "+i);
		}
	}
}
