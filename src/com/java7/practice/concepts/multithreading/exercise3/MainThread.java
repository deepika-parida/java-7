package com.java7.practice.concepts.multithreading.exercise3;

public class MainThread {
	
	public static void main(String[] args) {
		System.out.println("Thread name :: "+Thread.currentThread().getName()+"Thread Priority :: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println("Thread name :: "+Thread.currentThread().getName()+"Thread Priority :: "+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(11);
		System.out.println(Thread.MAX_PRIORITY + " "+Thread.MIN_PRIORITY+" "+Thread.NORM_PRIORITY);
		Runnable r = new ChildThread();
		Thread t = new Thread(r,"Child Thread - 0");
		//t.setPriority(2);
		t.start();
	}

}
