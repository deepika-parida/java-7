package com.java7.practice.concepts.multithreading.exercise3;

public class ChildThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Thread name :: "+Thread.currentThread().getName()+"Thread Priority :: "+Thread.currentThread().getPriority());
		for(int i =0; i < 100; i++){
			System.out.println("Child Thread :: "+i);
		}
	}

}
