package com.rays.pojo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		List<Product> pList = new ArrayList<>();
		String choice = null;
		do {
			System.out.println("Enter Product Details : ");
			System.out.print("Product Id:");
			int pId = scanner.nextInt();
			System.out.print("Product Name : ");
			String pName = scanner.next();
			System.out.print("Product Price : ");
			double pPrice = scanner.nextDouble();
			System.out.print("Quantity : ");
			int qty = scanner.nextInt();
			Product product = new Product(pId, pName, pPrice, qty);
			pList.add(product);
			System.out.println("Do you want to Continue Y/N");
			choice = scanner.next();
		}while(choice.equalsIgnoreCase("Y"));
		
		//Serialization
		FileOutputStream fos=null;
		ObjectOutputStream oss=null;
		try {
			fos = new FileOutputStream("d://IPM002//proBK.txt");
			oss = new ObjectOutputStream(fos);
			oss.writeObject(pList);
		}catch (Exception e) {
			System.out.println("Error in Serialization : "+e);
		}finally {
			fos.close();
			oss.close();
		}
		
		//De-Serialization
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("d://EAS//proBK.txt");
			ois = new ObjectInputStream(fis);
			List<Product> proList = (List<Product>) ois.readObject();
			
			for(Product p : proList) {
				System.out.println(p);
			}
		} catch (Exception e) {
			System.out.println("Error in De-Serialization : "+e);
		}finally {
			fis.close();
			ois.close();
		}

	}

}
