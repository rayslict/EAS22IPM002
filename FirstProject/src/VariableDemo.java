
public class VariableDemo {
	
	int a1;  //  Instace Varialbe  or Non-static variable
	static int b1;  // class variable or static variable
	
	int registerNumber;
	int $Age;
	int _salary;
	
	int age;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;   // local variable
		System.out.println(a);
		System.out.println(b1);
	}
	
	void disp() {
		System.out.println(a1+b1);
		int regNo = 101;
		long mobile = regNo;   // Implicit Casting
		
		long phone = 99444;
		//int ph1 = phone;
		int ph2 = (int)phone;   // Explicit Casting
		
		regNo++;  // regNo = regNo+1;
		
		int c = 10 > 5 ? 10 : 5;
		
	}

}
