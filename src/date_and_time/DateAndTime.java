package date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {

	public static void main(String[] args) {

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());

		// LocalDate date1= LocalDate.of(2025, 5, 15);
		LocalDate date2 = LocalDate.of(2025, Month.MAY, 15);

		System.out.println(date2);

		LocalTime time1 = LocalTime.of(6, 20);
		LocalTime time2 = LocalTime.of(6, 20, 15);
		LocalTime time3 = LocalTime.of(6, 20, 15, 200);

		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

		LocalDateTime dateTime1 = LocalDateTime.of(2023, 4, 23, 10, 34);
		System.out.println(dateTime1);

		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		System.out.println(dateTime2);

		// LocalDate d = new LocalDate(); //compiler error --cannot directly create
		// object --have to use of method
		// these are also immutable like strings

		// System.out.println(LocalDate.of(2023, 4,65)); //day of month cannot be more
		// than 31/32 so there will be datetime exception

		// Manipulations of date and time
		LocalDate dates = LocalDate.of(2025, 5, 15);
		System.out.println(dates);
		System.out.println(dates.plusDays(4));
		System.out.println(dates); // still 2025-05-19 because its immutable
		System.out.println(dates.plusWeeks(5));

		LocalTime times = LocalTime.of(5, 15);
		LocalDateTime datesTimes = LocalDateTime.of(dates, times);
		System.out.println(datesTimes);

		datesTimes = datesTimes.minusDays(1);
		System.out.println(datesTimes);

		LocalDateTime datesTimes1 = LocalDateTime.of(LocalDate.of(2025, 4, 24), LocalTime.of(5, 15)).minusDays(1)
				.minusHours(43).minusSeconds(50);
		System.out.println(datesTimes1); // method chaining

		Period period = Period.ofMonths(1);
		Period customPeriod = Period.of(1, 0, 10); // now custom period of 1 yeat and 10 days willl be created
		performAnimalEncrichment(LocalDate.of(2025, 5, 1), LocalDate.of(2025, 10, 30), period);

		// Formating dates and times
		System.out.println(dates.getMonth());
		System.out.println(dates.getDayOfWeek());
		 
		DateTimeFormatter formatted = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(formatted.format(datesTimes1));
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("MMMM dd,YYYY,hh:mm");
		System.out.println(pattern.format(datesTimes));
		//syso(pattern.format((dates)) //unsupported exception


	}

	static void performAnimalEncrichment(LocalDate start, LocalDate end, Period period) {
		LocalDate upto = start;
		while (upto.isBefore(end)) {
			System.out.println("Give New Toy:" + upto);
			upto = upto.plus(period);
		}
	}

}
