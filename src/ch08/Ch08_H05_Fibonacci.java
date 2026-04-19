package ch08;

public class Ch08_H05_Fibonacci {
    public static void main(String[] args) {
        int i;
        for (i=0; i<10; i++) {
            System.out.printf("%d ", fib(i));
        }
    }

    public static int fib(int n) {
        if (n==0) {
           return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return fib(n-2) + fib(n-1);
        }
    }
}
