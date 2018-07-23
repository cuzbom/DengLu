package com.lianxi1;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f1 = new File("D:/KuGou");
		String [] s1 = f1.list();
		
		for (String string : s1) {
			System.out.println(string);
		}
	}

}
