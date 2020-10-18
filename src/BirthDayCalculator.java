import java.time.LocalDate;
import java.time.Period;

import static java.time.Period.*;

public class BirthDayCalculator {
    public static void main(String[] args) {
        LocalDate today=  LocalDate.now();
        LocalDate birthdate = LocalDate.of(1998,3,13);
        int year = Period.between(birthdate,today).getYears();
        System.out.println(today);
        System.out.println(birthdate);
        System.out.println(year);

    }
}
