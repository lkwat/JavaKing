package Ch10;

public class Ch10_02_random {
    public static void main(String[] args) {
        double[] ran = new double[10];

        for (int i=0; i<10; i++) {
            ran[i] = Math.random();
            System.out.printf("%5.2f\t", ran[i]);  //列印隨機數
        }
    }
}
