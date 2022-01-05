
public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "rays.rmr@gmail.com;rays.lict@gmail.com;rays.rmr@hotmail.com;rays.rmr@yahoo.co.in";
		
		String emailIds[] = str.split("@");
		
		for(String p : emailIds) {
			System.out.println(p);
		}
		
	}

}
