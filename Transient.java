package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable
{
	int i=10;
	transient int j=20;
}

public class Transient 
{

	public static void main(String[] args) throws Exception
	{
		Dog1 d = new Dog1();
		
		FileOutputStream fos=new FileOutputStream("abc.ser");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(d);
		
		FileInputStream fis=new FileInputStream("abc.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog1 d2=(Dog1) ois.readObject();
		
		System.out.println(d2.i+"     "+d2.j);
	}

}
