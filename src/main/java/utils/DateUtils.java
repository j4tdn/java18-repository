package utils;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

//sql --> date, time, date_time

// jdbc --> java.sql.Date#getDate("...")
//          pst.setDate(java.sql.Date)
//      --> java.sql.Time#getTime("...")
//          pst.setTime(java.sql.Time)
//      --> java.sql.Timestamp("....")
//          pst.setTimestamp(java.sql.Timestamp)

// java --> java.util.Date, java.util.Calendar
//      --> java.time.LocalDate, java.time.LocalTime, java.time.LocalDateTime 

public class DateUtils {

	private DateUtils() {
	}

	public static java.sql.Date toSDate(LocalDate ldate) {
		return java.sql.Date.valueOf(ldate);
	}

	public static LocalDateTime toLDTime(Timestamp ts) {
		return ts.toLocalDateTime();
	}

}
