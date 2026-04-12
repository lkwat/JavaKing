package practice;

import java.util.Scanner;

/*
請你寫一個 Java 程式，讀入兩個正整數：
rows
cols
要求：
如果 rows <= 0 或 cols <= 0，印出 Invalid
否則印出一個 rows 列、cols 行 的長方形
每個位置都印 *
 */
public class P0407_04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input two positive integers : ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        if ( rows <=0 || cols <=0){
            System.out.println("Invalid");
        }
        else {
            for ( int r = 1;  r <= rows; r++){
                for (int c = 1; c <=cols; c++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
