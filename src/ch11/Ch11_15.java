package ch11;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ch11_15 {
    public static void main(String[] args) {
        Instant from, to;  //更動處;
        final int pwd = 70;
        int num;
        Scanner scanner = new Scanner(System.in);
        from = Instant.now();  //更動處;
        for(; ;) {
            System.out.print("請猜0-99之間的數字: ");
            num = scanner.nextInt();
            if(num==pwd) {
                System.out.println("恭喜猜對了!!");
                to = Instant.now();  //更動處;
                break;
            }
            System.out.println("猜錯了，請再猜一次：");
        }
        Duration dura = Duration.between(from, to);
        System.out.println("所花時間總天數: " + dura.toDays());
        System.out.println("所花時間小時數: " + dura.toHours());
        System.out.println("所花時間分鐘數: " + dura.toMinutes());
        System.out.println("所花時間總秒數: " + dura.toSeconds());
        System.out.println("所花時間毫秒數: " + dura.toMillis());
        System.out.println("所花時間奈秒數: " + dura.toNanos());
    }
}
