package chap3Summary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.APRIL, 30);  //we will get same output because date is immutable
        date.plusDays(2);
        date.plusYears(3);
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
        
        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
        Period p = Period.of(1, 2, 3);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);  //localizedtime only process time so 11:22 am
        System.out.println(d.format(f));
    }
}