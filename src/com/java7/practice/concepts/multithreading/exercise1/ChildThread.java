package com.java7.practice.concepts.multithreading.exercise1;

public class ChildThread extends Thread{
	
	public ChildThread(String name){
		super(name);
	}
	
	@Override
	public void start() {
		super.start();
		System.out.println("Thread start");
	}
	
	public void run(){
		System.out.println("Thread executing :: "+ Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i = 0; i < 100; i++){
			System.out.println("Chile Thread :: "+i);
		}
	}
}
