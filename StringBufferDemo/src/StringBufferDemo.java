
public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer();
		StringBuffer buffer2 = new StringBuffer("Mohamed Raffic");
		
		System.out.println(buffer);
		System.out.println(buffer2);
		System.out.println(buffer.length());
		System.out.println(buffer2.length());
		System.out.println(buffer.capacity());   
		System.out.println(buffer2.capacity());   
		System.out.println(buffer2.append(" Rasul"));
		System.out.println(buffer2);

	}

}
