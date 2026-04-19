package ch08;

import java.util.Scanner;

public class Ch08_H06_Grade {
    public static void main(String[] args) {
        int yourScore;
        System.out.println("請輸入分數 :");
        Scanner scanner = new Scanner(System.in);
        yourScore = scanner.nextInt();
        System.out.printf("%c\n", grade(yourScore));
        System.out.println("請輸入分數 :");
        yourScore = scanner.nextInt();
        System.out.printf("%c\n", grade(yourScore));
    }
    public static char grade(int score) {
        if (score>=90) {
            return 'A';
        }
        else if (score>=80 && score<90){
            return 'B';
        }
        else if (score>=70 && score<80){
            return 'C';
        }
        else if (score>=60 && score<70){
            return 'D';
        }
        else {
            return 'F';
        }
    }

}
