package com.lianxi4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//write1();
		
		read1();

	}
	
	public static void write1() throws FileNotFoundException, IOException {
		/*Student stu1 = new Student("¹¨Ê«¼Î",23);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("a.txt")));
		
		oos.writeObject(stu1);
		oos.flush();
		oos.close();*/
		
		Student stu1 = new Student("dd", 23);
		Student stu2 = new Student("ÍõÀÚ", 1);

		FileOutputStream fout = new FileOutputStream("D:/KuGou/a.txt");
		
		ObjectOutputStream oout = new ObjectOutputStream(fout);

		oout.writeObject(stu1);
		oout.writeObject(stu2);
		oout.flush();
		oout.close();

		
	}

	public static void read1() throws FileNotFoundException, IOException, ClassNotFoundException {
		File f1 = new File("D:/KuGou/a.txt");
		f1.createNewFile();
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(f1));
		
		Student stu2 = (Student)ois.readObject();
		Student stu1 = (Student)ois.readObject();
		
		
		ois.close();
		
		
		System.out.println(stu1.getName()+"-----------"+stu1.getAge());
		System.out.println(stu2.getName()+"-----------"+stu2.getAge());
	}
}