
public class AraayDemo {

	public static void main(String[] args) {
		
		int regNo[] = {101,102,103,104,105};  // size if the array 5  ---> index from 0 to 4
		
		System.out.println(regNo[0]);
		System.out.println(regNo[1]);
		System.out.println(regNo[2]);
		System.out.println(regNo[3]);
		System.out.println(regNo[4]);
		System.out.println("******* Using For loop******");
		
		for(int i=0;i<5;i++) {
			System.out.println(regNo[i]);
		}
		
		System.out.println("******* Using Enhanced For loop******");
		for(int pri : regNo) {  //Enhanced for loop
			System.out.println(pri);
		}

	}

}
