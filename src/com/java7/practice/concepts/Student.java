package com.java7.practice.concepts;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 946284414029944353L;
	private String name;
	private int rollno;
	
	public Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		
		if(obj instanceof Student){
			Student s = (Student) obj;
			if (this.name.equals(s.name) && this.rollno == s.rollno)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Student: name-"+this.name+", rollno-"+this.rollno;
	}
	
}
