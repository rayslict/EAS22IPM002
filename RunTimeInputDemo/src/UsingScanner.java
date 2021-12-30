
import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Uding Scanner ");
		
		System.out.println("Enter your Name : ");
		String stuName = scanner.nextLine();
		System.out.println("Enter your Reg Number : ");
		int regNo = scanner.nextInt();
		System.out.println("Enter Height :");
		double height=scanner.nextDouble();
		
		System.out.println("Name : "+stuName);
		System.out.println("Register Number : "+regNo);
		System.out.println("Height : "+height);

	}

}
