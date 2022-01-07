package com.rays;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try(FileInputStream inputStream = new FileInputStream("D:\\IPM002\\java_programs\\FirstPro.java");
			FileOutputStream outputStream = new FileOutputStream("d:\\IPM002\\newone.java");
				BufferedOutputStream bos = new BufferedOutputStream(outputStream);){						
		int a=0;		
		while((a=inputStream.read())!=-1) {
			bos.write(a);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}

		System.out.println("Completed....");
	}

}



