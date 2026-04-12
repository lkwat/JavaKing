package practice;

import java.util.Scanner;

public class P0406_01 {
    public static void main(String[] args){
        int number;
        int i;
        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個整數 : ");
        number = scanner.nextInt();
        if (number<=0){
            System.out.println("Invalid");
        }
        else {
            for(i=1; i<=number; i++){
                if(i%2==0){
                    total = total - i ;
                }
                else{
                    total = total + i;
                }
            }
            System.out.println("sum = " + total);
        }
    }
}
