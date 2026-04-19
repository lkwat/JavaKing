package ch08;

public class Ch08_23_Factorial {
    public static void main(String[] args) {
        System.out.printf("3 的階乘結果是%3d \n", factorial(3));
        System.out.printf("5 的階乘結果是%3d \n", factorial(5));
    }

    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        else return (n*factorial(n-1));
    }
}

