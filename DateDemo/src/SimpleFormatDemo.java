import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleFormatDemo {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date);    // Thu Jan 06 11:51:02 IST 2022
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String da =  sdf.format(date);
		System.out.println(da);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter DAte (MM/dd/yyyy)");
		String inDate = scanner.next();
		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
		Date d =  sdf1.parse(inDate);
		System.out.println(d);
	}

}
