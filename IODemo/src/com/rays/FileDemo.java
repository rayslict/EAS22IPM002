package com.rays;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {
	
	public static void main(String as[]) throws IOException {
	File f = new File("D:\\IPM002\\java_programs\\EncapsulationDemo\\src\\com\\cognizant\\EmployeeMain.java");
	File f1 = new File("D:\\IPM002\\java_programs");
	System.out.println(f.getName());
	System.out.println(f.length());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	System.out.println(f.isFile());
	System.out.println(f.isDirectory());
	System.out.println(f.isHidden());
	System.out.println(f.lastModified());
	System.out.println(new Date(f.lastModified()));
	
	String fname[] = f1.list();
	
	for(String p:fname) {
		System.out.println(p);
	}
	
	
	System.out.println("List of Files Using listFiless()...");
	File fna[]= f1.listFiles();
	
	for(File ff : fna) {
		System.out.println(ff.getPath());
	}
	
	File c =  new File("d://IPM002//io.txt");
	c.createNewFile();
	
	
	}
}
