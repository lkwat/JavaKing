package ch06;

import java.util.Scanner;

public class Ch06_H04 {
    public static void main(String[] args){
        int basemoney;
        double totalsave;
        int i,year;
        double rate;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入存款本金: ");
        basemoney = scanner.nextInt();
        System.out.print("請輸入存款年數: ");
        year = scanner.nextInt();
        System.out.print("請輸入存款利率(例如 5% 請輸入 0.05): ");
        rate = scanner.nextDouble();
        totalsave = basemoney;
        for(i=1; i<=year; i++){
            totalsave = totalsave*(1+rate);
            System.out.printf("第 %d 年本金和　%.1f%n", i, totalsave);
        }
    }
}
