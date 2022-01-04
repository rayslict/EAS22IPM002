import java.util.Scanner;

public class AraayDemo2 {

	public static void main(String[] args) {
		
		int regNo[] = new int[5]; // size if the array 5  ---> index from 0 to 4
		String stuName[]=new String[5];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter Register No...:");
			regNo[i] = scanner.nextInt();
			System.out.print("Enter Name ...:");
			stuName[i] = scanner.next();
		}
		
		System.out.println("******* Using For loop******");
		
		for(int i=0;i<5;i++) {
			System.out.println("Register No: "+regNo[i]);
			System.out.println("Student Name : "+stuName[i]);
		}
		
		/*System.out.println("******* Using Enhanced For loop******");
		for(int pri : regNo) {  //Enhanced for loop
			System.out.println(pri);
		}*/

	}

}
