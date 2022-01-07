package com.rays;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputDemo2 {

	public static void main(String[] args) throws IOException {
		// try with resource, AutoClosable interface implemented and close() called implicitly
				 
		try(FileInputStream inputStream = new FileInputStream("D:\\IPM002\\java_programs\\FirstPro.java");				
				BufferedInputStream bis = new BufferedInputStream(inputStream);) {
			
		int a=0;
		
		while((a=bis.read())!=-1) {
			System.out.print((char)a);
		}

		}catch (Exception e) {
			System.out.println("Error : "+e);
		}
		
		
	}

}



