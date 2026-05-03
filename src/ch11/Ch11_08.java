package ch11;

import java.time.LocalTime;

public class Ch11_08 {
    public static void main(String[] args) {
        LocalTime today = LocalTime.now();
        System.out.println("現在時間: " + today);
        System.out.println("     時: " + today.getHour());
        System.out.println("     分: " + today.getMinute());
        System.out.println("     秒: " + today.getSecond());
        System.out.println("    奈秒: " + today.getNano());
    }
}
