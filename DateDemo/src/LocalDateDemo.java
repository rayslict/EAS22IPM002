import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		LocalDate pDate = LocalDate.now();
		
		LocalDate addYear =  pDate.plusYears(-1);
		
		System.out.println(pDate);
		
		System.out.println(addYear);
		
		
		LocalTime pTime = LocalTime.now();
		
		System.out.println(pTime);
		
		LocalDateTime pDateTime = LocalDateTime.now();
		
		System.out.println(pDateTime);

	}

}
