package com.java7.practice.concepts;

import java.io.IOException;

public class Person {
	
	protected Person display(String firstname,String lastname) throws IOException{
		System.out.println("I am a Person. My name is : "+firstname+" "+lastname);
		return new Person();
	}

}
