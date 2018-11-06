package com.java7.practice.concepts.cloning;

public class Department {
	
	private String name;
	private int no;
	
	public Department(String name, int no){
		this.name = name;
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", no=" + no + "]";
	}
}
