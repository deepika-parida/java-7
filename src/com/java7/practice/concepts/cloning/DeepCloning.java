package com.java7.practice.concepts.cloning;

public class DeepCloning {
	
	public static void main(String[] args) {
		Employee s1 = new Employee("Amit",12,new Department("Maths", 1));
		System.out.println(s1);
		Employee s2 = null;
		try {
			s2 = (Employee)s1.clone();
			System.out.println(s2);
			s2.getDept().setName("English");
			s2.getDept().setNo(2);
			s2.setId(20);
			s2.setName("Fanny");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(s2);
		System.out.println(s1);
	}

}
