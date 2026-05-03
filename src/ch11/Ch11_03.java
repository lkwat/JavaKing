package ch11;

import java.util.Scanner;

public class Ch11_03 {
    public static void main(String[] args) {
        long startDate, endDate;
        final int pwd = 70;
        int num;
        Scanner scanner = new Scanner(System.in);
        startDate = System.currentTimeMillis();
        for(; ;) {
            System.out.println("請猜0-99的數字");
            num = scanner.nextInt();
            if(num==pwd) {
                System.out.println("恭喜猜對了!!");
                endDate = System.currentTimeMillis();
                break;
            }
            System.out.println("猜錯了,請再答一次!");
        }
        System.out.printf("所花時間 %d 毫秒", (endDate-startDate));
    }
}
