package DateandTimeAPI;
import java.time.LocalDate;
import java.time.DayOfWeek;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
LocalDate currDate = LocalDate.now();
		
		LocalDate someotherDate=LocalDate.of(2000, 07, 04);
		
	    LocalDate date=LocalDate.parse("2012-08-10");
	    
		LocalDate yesterday=currDate.minusDays(1);
		LocalDate tommorrow=currDate.plusDays(1);
		
		DayOfWeek dayOfWeek=currDate.getDayOfWeek();
		int DayOfMonth=currDate.getDayOfMonth();
		int DayOfYear=currDate.getDayOfYear();
		
		System.out.println("current Date is "+currDate);
		
		System.out.println("some other Date is "+someotherDate);
		
		System.out.println("Date is "+date);
		
		System.out.println("Current date is after yesterday's date  "+yesterday);
		System.out.println("Current date is before tommorrrow's date  "+tommorrow);
		
		System.out.println("Day of week is "+dayOfWeek);
		System.out.println("Day of month is "+DayOfMonth);
		System.out.println("Day of year is "+DayOfYear);
	}

}
