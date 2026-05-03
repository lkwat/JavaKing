package ch11;

import java.time.LocalDateTime;

public class Ch11_12 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2026, 5, 4, 4, 48);
        System.out.println("新的日期時間: " + dateTime);
        dateTime = LocalDateTime.of(2026, 5, 4, 4, 50, 30);
        System.out.println("新的日期時間: " + dateTime);
        dateTime = LocalDateTime.of(2026, 5, 4, 4, 55, 30, 300000000);
        System.out.println("新的日期時間: " + dateTime);
    }
}
