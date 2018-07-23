package com.lianxi2;

import java.io.File;

public class Test {

	public static void main(String[] args) {
		File f1 = new File("D:/KuGou");
		String [] s1 = f1.list();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i].endsWith(".jpg")) {
				System.out.println(s1[i]);
			}
		}

	}

}
