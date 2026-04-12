package practice;

import java.util.Scanner;

/*
請你寫一個 Java 程式，讀入一個正整數 n。
要求：
如果 n <= 0，印出 Invalid
否則印出一個 n 列、n 行的方形
每個位置都印 *
 */
public class P0407_03 {
    public static void main(String[] args){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a positive integer : ");
        n = scanner.nextInt();
        if (n <= 0){
            System.out.println("Invalid");
        }
        else{
            for ( int row = 1; row <= n; row++) {
                for (int column = 1; column <= n; column++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}



