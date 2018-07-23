package com.exp2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		
		String a = "OOOOOOOOOOOOOO";
		File f = new File("D:/KuGou/a.txt");
		OutputStream os = new FileOutputStream(f);
		
		byte [] b =a.getBytes();
		os.write(b);
		
		os.flush();
		os.close();

	}

}
