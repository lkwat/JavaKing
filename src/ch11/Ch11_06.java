package ch11;

import java.time.LocalDate;
import java.time.Month;

public class Ch11_06 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2020, 1, 20);
        System.out.println("新的日期: " + today);
        LocalDate newtoday = LocalDate.of(2020, Month.FEBRUARY, 20);
        System.out.println("新的日期: " + newtoday);
    }
}
