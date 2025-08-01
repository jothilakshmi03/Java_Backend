package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("Date : "+date);
        LocalDateTime Datetime =LocalDateTime.now();
        System.out.println(Datetime);
        LocalTime time=LocalTime.now();
        System.out.println("Time : "+time);

        //custom date and time
        LocalDate bday=LocalDate.of(2003,12,19);
        System.out.println(bday);
        LocalTime bt=LocalTime.of(12,43);
        System.out.println(bt);

        LocalDate d=LocalDate.now();
        DateTimeFormatter formatt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format=d.format(formatt);
        System.out.println(format);

        LocalDate add=LocalDate.now().plusMonths(3);
        System.out.println(add);
        LocalDate minus=LocalDate.now().minusMonths(3);
        System.out.println(minus);

        LocalDate d1=LocalDate.now();
        LocalDate d2=LocalDate.of(2003,12,19);
        Period p=Period.between(d1,d2);
        System.out.println("years"+p.getYears()+" months"+p.getMonths()+" days"+p.getDays());
    }
}
