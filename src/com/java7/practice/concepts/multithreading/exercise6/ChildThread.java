package com.java7.practice.concepts.multithreading.exercise6;

public class ChildThread implements Runnable{
	
	static Thread t;
	
	@Override
	public void run() {
		try {
			for (int i = 0; i < 100; i++) {
				System.out.println("Child Thread :: "+i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		
	}
}
