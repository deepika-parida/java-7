package com.java7.practice.concepts.immutable;

public final class Employee{
	private String name;
	private int id;
	private final Department dept;
	
	public Employee(String name,int id, Department dept){
		this.name = name;
		this.id = id;
		this.dept = new Department(dept.getName(), dept.getNo());
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Department getDept() {
		Department d = null;
		try {
			d = (Department)dept.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return d;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + "]";
	}
}
