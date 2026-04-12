package ch07;

public class Ch07_H03 {
    public static void main(String[] args){
        double[] data = {1100, 652, 946, 821, 955, 1024, 1155};
        double sum = 0;
        for (int i=0; i<data.length; i++){
            sum = sum +data[i];
        }
        double average = 0;
        average = sum / data.length;
        System.out.printf("平均值 = %4.2f%n", average);

        double variance = 0;
        for(int i = 0; i< data.length; i++){
            variance = variance + Math.pow((data[i] - average), 2);
        }
        variance = variance / data.length;
        System.out.printf("變異數 = %4.2f%n", variance);

        double deviation = 0;
        deviation = Math.pow(variance, 0.5);
        System.out.printf("標準差 = %4.2f%n", deviation);

    }
}
