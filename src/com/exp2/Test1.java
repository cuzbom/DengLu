package com.exp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		
		System.out.println("请输入路径1：");
		String path1 = sc.next();
		File f1 = new File(path1);
		System.out.println("请输入路径2：");
		String path2 = sc.next();
		File f2 = new File(path2);
		
		FileInputStream fis = new FileInputStream(f1);
		FileOutputStream fos = new FileOutputStream(f2);
		
		byte [] bs = new byte[1024];
		
		int i = 0;
		while ((i = fis.read(bs)) != -1) {
			fos.write(bs);
		}
		fis.close();
		fos.flush();
		fos.close();

	}

}
