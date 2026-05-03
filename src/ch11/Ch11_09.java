package ch11;

import java.time.LocalTime;

public class Ch11_09 {
    public static void main(String[] args) {
        LocalTime timenow = LocalTime.of(9, 10);
        System.out.println("新的時間: " + timenow);
        timenow = LocalTime.of(9, 10, 30);
        System.out.println("新的時間: " + timenow);
        timenow = LocalTime.of(9, 10, 30, 300000000);
        System.out.println("新的時間: " + timenow);
    }
}
