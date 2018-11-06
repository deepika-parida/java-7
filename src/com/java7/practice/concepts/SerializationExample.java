package com.java7.practice.concepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
	
	public static void main(String[] args) {
		
		Student s = new Student("Emily", 22);
		System.out.println("Before Serialization :: "+s);
		try {
			//serialize
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.ser"));
			os.writeObject(s);
			
			//deserialize
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
			Student s1 = (Student)in.readObject();
			System.out.println("After DeSerialization : "+s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
