package com.lianxi5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Scanner;

public class Bigbig {
	
	private static Scanner sc = new Scanner(System.in);

	public void zhuCe() throws FileNotFoundException, IOException {
		System.out.println("◊¢≤·“≥√Ê------------------------");
		System.out.println("«Î ‰»ÎÍ«≥∆£∫");
		String name = sc.next();
		
		System.out.println("«Î ‰»Î√‹¬Î£∫");
		int password = sc.nextInt();
		
		Yonghu y1 = new Yonghu(name, password);
		File f1 = new File("D:/KuGou/"+name+".txt");
		ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(f1));
		f1.createNewFile();
		oos1.writeObject(y1);
		oos1.flush();
		oos1.close();
	}
	
	public void dengLu() throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("µ«¬º“≥√Ê------------------------");
		
		System.out.println("«Î ‰»Îµ«¬ºÍ«≥∆£∫");
		String name = sc.next();
		ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(new File("D:/KuGou/"+name+".txt")));
		
		Yonghu y1 = (Yonghu)ois1.readObject();
		
		ois1.close();
		
		
		if ((y1.getName()).equals(name)) {
			System.out.println("«Î ‰»Îµ«¬º√‹¬Î£∫");
			int password = sc.nextInt();
			
			if (y1.getPassword() == password) {
				System.out.println("µ«¬º≥…π¶£°£°£°£°");
			}else {
				System.out.println("√‹¬Î ‰»Î”–ŒÛ£°£°");
			}
		}else {
			System.out.println("”√ªßÍ«≥∆ ‰»Î”–ŒÛ£°£°£°£°");
		}
	}
}
