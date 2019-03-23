package java8;

public class EnumTest {
	
	enum Day {
		
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
		
	}

	private Day day;
	
	public EnumTest(Day day){
		
		this.day=day;
	}
	
	public static void isDayLike(Day day){
	
		switch(day){
		
		case MONDAY:
			 System.out.println("Monday is headache");
			 break;
		case TUESDAY:
			 System.out.println("Tuesday is headache");
			 break;
		case WEDNESDAY:
			 System.out.println("Tuesday is headache");
			 break;
		case SATURDAY:
			 System.out.println("Saturday is nice");
		case SUNDAY: 
	            System.out.println("Weekends are best."); 
	            break;
		default:
			System.out.println("Midweek days are so-so."); 
            break; 
			
		}
		
	}

	public static void main(String[] args) {
		
		//EnumTest.isDayLike(Day.SUNDAY);
		EnumTest.isDayLike(Day.SATURDAY);

		
		
	}

}
