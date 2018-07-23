 package com.exp1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Test {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("D:/KuGou/a.txt");
		int i = 0;
		while((i=is.read())!=-1) {
			char k = (char)i;
			System.out.println(k);
		}
		
		System.out.println(i);
	}
}
