package ch06;

public class Ch06_H10 {
    public static void main(String[] args) {
        double e = 1.0;
        int n = 100;
        int i;
        double item = 1.0;

        for (i = 1; i <= n; i++) {
            item = item * i;
            e = e + 1.0 / item;

            if (i % 10 == 0) {
                System.out.println(e);
            }
        }
    }
}