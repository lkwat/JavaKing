package ch07;

public class Ch07_H04 {
    public static void main(String[] args){
        double[] high = {30, 28, 29, 31, 33, 35, 32};
        double[] low  = {20, 21, 19, 22, 23, 24, 20};

        double highest = high[0];
        for(double e:high){
            if (e > highest)
                highest = e;
        }
        System.out.printf("最高溫 = %4.1f%n", highest);

        double lowest = low[0];
        for(double e:low){
            if(e < lowest)
                lowest = e;
        }
        System.out.printf("最低溫 = %4.1f%n", lowest);

        System.out.print("每天平均溫度 : ");
        for (int i=0; i<high.length; i++){
            System.out.printf("%5.2f\t", (high[i]+low[i])/2);
        }
    }
}
