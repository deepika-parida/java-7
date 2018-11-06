package com.java7.practice.concepts;

import java.util.Comparator;
import java.util.TreeMap;

public class StudentTest {
	static int j = 0;
	
	static{
		j++;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Ravi", 10);
		Student s2 = new Student("Ram", 11);
		Student s3 = new Student("Ravi", 10);
		Student s4 = null;
		Student s5 = s1;
		Calculator c = new Calculator();
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s5));//true
		System.out.println(s1.equals(s4));//false
		System.out.println(s1.equals(c));//false
		//System.out.println(s4.equals(s1));//NPE
		
		TreeMap t = new TreeMap<>(new MyComparator());
		t.put("a", "111");
		t.put("b", "1234");
		t.put("d", "14");
		t.put("c", "134");
		t.put(10, "345");
		System.out.println(t);
	}
}

class MyComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1);
	}
	
}


