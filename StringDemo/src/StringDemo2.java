
public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java is a Platform Independent Language";
		String str2 = "java is a Platform Independent Language";
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', 5));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf('a',30));
		System.out.println(str.startsWith("Java"));
		System.out.println(str.endsWith("age"));
		System.out.println(str.replace('a', '@'));
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,38));
		System.out.println(str);
	}

}
