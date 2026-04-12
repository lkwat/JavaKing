package ch06;

public class Ch06_H01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 1) {
                sum = sum + i;
            }
        System.out.println(sum);
    }
}
