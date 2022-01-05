import java.util.StringTokenizer;

public class StringTokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer tokenizer = new StringTokenizer("India,AUstralia,England,Russia", ",");
		
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

	}

}
