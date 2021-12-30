import java.io.DataInputStream;
import java.io.IOException;

public class UsingDataInput {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		DataInputStream inputStream =new DataInputStream(System.in);
		
		System.out.println("Enter your Name : ");
		String stuName = inputStream.readLine();
		System.out.println("Enter your Reg Number : ");
		int regNo = Integer.parseInt(inputStream.readLine());
		System.out.println("Enter Height :");
		double height=Double.parseDouble(inputStream.readLine());
		
		System.out.println("Name : "+stuName);
		System.out.println("Register Number : "+regNo);
		System.out.println("Height : "+height);

	}

}
