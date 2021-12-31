
public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo sd1 = new StaticDemo();
		StaticDemo sd2 = new StaticDemo();
		StaticDemo sd3 = new StaticDemo();
		
		sd1.a=100;
		sd1.b=200;
		
		sd2.a=300;
		sd2.b=400;
		
		sd3.a=500;
		sd3.b=600;
		
		sd1.staMet();
		sd2.staMet();
		sd3.staMet();
		
		sd1.hai();
		sd2.hai();
		sd3.hai();
		
		StaticDemo.hai();   // static way to call static members

	}

}

