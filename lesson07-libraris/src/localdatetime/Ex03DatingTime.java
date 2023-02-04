package localdatetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * 
 * Ex04: Tính thời gian từ lúc sinh ra đến hiện tại
 *
 */
public class Ex03DatingTime {
	public static void main(String[] args) {
		// 29/06/2002
		LocalDateTime dayOfBirth = LocalDateTime.of(2002, 6, 29, 12, 12, 12);
		System.out.println("dayOfBirth  " + format(dayOfBirth));
		 
	
		// now
		LocalDateTime now = LocalDateTime.now();
	    System.out.println("now " + now);
	    
	    if(now.isBefore(dayOfBirth)) {
	    	throw new IllegalArgumentException("Day of birth must be less than now(time)");
	    }
	    //B1 convert now and dayofbirth to localdate
	    LocalDate startInLocalDate = dayOfBirth.toLocalDate();
	    LocalDate endInLocalDate = now.toLocalDate();
	    
	    Period period = Period.between(startInLocalDate, endInLocalDate);
	    
	    //B2 convert now and dayofbirth to localdate
	    LocalTime startInLocalTime = dayOfBirth.toLocalTime();
	    LocalTime endInLocalTime = now.toLocalTime();
	    
	    Duration duration = Duration.between(startInLocalTime, endInLocalTime);
	    if(duration.isNegative()) {
	    	duration = duration.plusDays(1);
	    	period = period.minusDays(1);
	    }
	    System.out.println(getUnit(period.getYears() , " years")
		          +getUnit(period.getMonths() , " months")
		          +getUnit(period.getDays() , " days"));
	    System.out.println("hours:" + duration.toHours());
		System.out.println("minutes:" + duration.toMinutesPart());
		System.out.println("seconds:" + duration.toSecondsPart());
	}
	    
	    private static String format(LocalDateTime ldatetime) {
	    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	    	   return dtf.format(ldatetime);
	    	
	    }
	    
	    private static String getUnit(int value, String unit) {
        	return value == 0 ? "" : value + unit;
        }
	    
	}
	    
	    
	    
	    
	


