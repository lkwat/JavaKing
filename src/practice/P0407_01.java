package practice;

import java.util.Scanner;

public class P0407_01 {
    public static void main(String[] args){
        int total = 0;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer : ");
        n = scanner.nextInt();

        if(n <= 0){
            System.out.println("Invalid");
        }
        else {
            for (int i = 1; i <= n; i++){
                if ( i%3 == 0 ){
                    total = total - i;
                }
                else {
                    total = total + i;
                }
            }
            System.out.println("total = " + total);
        }
    }
}
