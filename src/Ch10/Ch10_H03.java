package Ch10;

import java.util.Random;
import java.util.Scanner;

public class Ch10_H03 {
    public static void main(String[] args) {
        Random ran = new Random();
        //int num = ran.nextInt(1,11);
        int num = ran.nextInt(10) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("請猜1- 10間的數字:");
            guess = scanner.nextInt();
            if (guess < num) {
                System.out.println("請猜大一點");
            } else if (guess > num) {
                System.out.println("請猜小一點");
            } else {
                System.out.println("恭喜答對了");
            }
        }while (guess!=num);
        scanner.close();
    }
}
