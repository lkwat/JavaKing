package ch06;
import java.util.Scanner;

public class Ch06_H03 {
    public static void main(String[] args) {
        final int pwd = 70;
        int count = 0;
        int number;
        String option;
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            System.out.println("請猜 0~99 的數字：");
            number = scanner.nextInt();
            count++;

            if (number == pwd) {
                System.out.println("恭喜猜對了");
                System.out.println("總共猜了 " + count + " 次");
                break;
            }

            if (number > pwd) {
                System.out.println("請猜小一點!!!");
            } else {
                System.out.println("請猜大一點");
            }

            System.out.println("若不想繼續猜，可以按 Q 或 q 離開；要繼續請輸入其他字元：");
            option = scanner.next();

            if (option.equals("Q") || option.equals("q")) {
                System.out.println("歡迎再玩一次");
                break;
            }
        }
    }
}