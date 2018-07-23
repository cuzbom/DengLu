package com.lianxi3;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File f1 =new File("D:/KuGou");
		goGo(f1);
	}


	public static void goGo(File f) {
		if (f != null) {
			if (f.isDirectory()) {
				File[] s1 = f.listFiles();
				if (s1 != null) {
					System.out.println(f);
					for (int i = 0; i < s1.length; i++) {
						goGo(s1[i]);
					}
					
				}
			}else {
				System.out.println(f);
			}
		}
	}
	
}