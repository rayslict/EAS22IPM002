package com.rays;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream inputStream = null;
		BufferedInputStream bis = null;
		try {
		 inputStream = new FileInputStream("D:\\IPM002\\java_programs\\FirstPro.java");
		
		 bis = new BufferedInputStream(inputStream);
		int a=0;
		
		while((a=bis.read())!=-1) {
			System.out.print((char)a);
		}

		}catch (Exception e) {
			System.out.println("Error : "+e);
		}finally {
			bis.close();
			inputStream.close();
		}
		
		
	}

}



