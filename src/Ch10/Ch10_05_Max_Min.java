package Ch10;

public class Ch10_05_Max_Min {
    public static void main(String[] args) {
        int x1 = 30;
        int x2 = 50;
        int x3 = 80;
        int maxV;
        maxV = Math.max(Math.max(x1, x2), x3);
        System.out.println("3個數值的較大值是: " + maxV);
        double y1 = 5.5;
        double y2 = 3.6;
        double minV;
        minV = Math.min(y1, y2);
        System.out.println("2個數值的較小值是: " + minV);
    }
}
