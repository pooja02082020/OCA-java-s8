package inhertitance;

import java.time.LocalDate;
import java.time.Period;

public class TestClass {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.setAge(8);
		lion.setName(" Tiger");
		lion.roar();
		
		 LocalDate newYear = LocalDate.of(2018, 1, 1);
         LocalDate eventDate = LocalDate.of(2018, 1, 1);
         boolean flag1 = newYear.isAfter(eventDate);
         boolean flag2 = newYear.isBefore(eventDate);
         System.out.println(flag1 + ":" + flag2);
         
         LocalDate date = LocalDate.parse("2000-01-01");
         Period period = Period.ofYears(-3000);
         System.out.println(date.plus(period));
         
        
	}

}
