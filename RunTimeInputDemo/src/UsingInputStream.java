import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UsingInputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Uding INput Stream Reader");
		
		System.out.println("Enter your Name : ");
		String stuName = br.readLine();
		System.out.println("Enter your Reg Number : ");
		int regNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Height :");
		double height=Double.parseDouble(br.readLine());
		
		System.out.println("Name : "+stuName);
		System.out.println("Register Number : "+regNo);
		System.out.println("Height : "+height);

	}

}
