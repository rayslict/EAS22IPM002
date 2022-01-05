
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is a Platform Independent Language";
		String str1 = new String();
		String str2 = new String("Mohamed Raffic");
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "Cognizant";    // Implicit Object
		String str4 = "Cognizant";
		String str5 = new String("Cognizant");   // Explicit Object
		String str6 = new String("Cognizant");
		
		if(str3==str4)    // true
			System.out.println("Hello All...");
		
		if(str5==str6)   // false
			System.out.println("Hi All...");

	}

}
