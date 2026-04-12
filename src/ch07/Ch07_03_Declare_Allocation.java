package ch07;

public class Ch07_03_Declare_Allocation {
    public static void main(String[] args){
        double average;
        double total = 0;
        double [] degree = new double[7];

        degree[0] = 25;
        degree[1] = 22;
        degree[2] = 24;
        degree[3] = 20;
        degree[4] = 26;
        degree[5] = 21;
        degree[6] = 21;

        for (int i=0; i<7; i++){
            total += degree[i];
        }
        average = total/7;
        System.out.printf("\n一週平均溫度 : %5.2f\n", average);
    }
}
