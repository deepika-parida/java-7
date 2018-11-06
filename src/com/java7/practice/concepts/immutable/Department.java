package com.java7.practice.concepts.immutable;

public class Department implements Cloneable{
	
	private String name;
	private int no;
	
	public Department(String name, int no){
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public int getNo() {
		return no;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", no=" + no + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
