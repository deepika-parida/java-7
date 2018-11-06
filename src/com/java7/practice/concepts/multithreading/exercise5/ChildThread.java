package com.java7.practice.concepts.multithreading.exercise5;

public class ChildThread implements Runnable{
	
	static Thread t;
	
	@Override
	public void run() {
		try {
			t.join();
			for (int i = 0; i < 100; i++) {
				System.out.println("Child Thread :: "+i);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		
	}
}
