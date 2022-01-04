import java.util.Scanner;

public class AraayDemo3 {

	public static void main(String[] args) {

		int regNo[][] = new int[3][3]; // size if the array 5 ---> index from 0 to 4

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				regNo[i][j] = scanner.nextInt();
			}
		}

		System.out.println("******* Using For loop******");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(regNo[i][j]);
			}

		}

	}

}
