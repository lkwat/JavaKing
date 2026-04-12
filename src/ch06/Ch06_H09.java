package ch06;

public class Ch06_H09 {
    public static void main(String[] args) {
        int n;
        int d;

        for (n = 2; n < 20; n++) {
            for (d = 2; d <= n; d++) {
                if (n % d == 0) {
                    break;
                }
            }

            if (d == n) {
                System.out.println(n);
            }
        }
    }
}