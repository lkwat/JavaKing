package ch07;

import java.util.Scanner;
public class Ch07_H05 {
    public static void main(String[] args){
        int[] score = new int[100];
        int count = 0;
        int sum=0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("如果輸入負分數則輸入結束");

        while (true){
            System.out.print("請輸入分數: ");
            int s = scanner.nextInt();

            if (s<0){
                break;
            }
            score[count] = s;
            count++;
            sum = sum + s;
        }
        average = (double) sum/count;

        int above=0;
        int below=0;
        for(int i=0; i<count; i++){
            if (score[i]>average){
                above ++;
            }
            else if (score[i]<average){
                below ++;
            }
        }
        System.out.printf("分數筆數: %d%n", count);
        System.out.printf("平均分數: %.2f%n", average);
        System.out.printf("高於平均分數人數: %d%n", above);
        System.out.printf("低於平均分數人數: %d%n", below);
    }
}
