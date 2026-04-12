package ch07;

public class Ch07_05_Initialize {
    public static void main(String[] args){
        double average = 0;
        double total = 0;
        double [] degree = {25,22,24,20,26,21,21};

        for (int i =0; i< degree.length; i++){
            total += degree[i];
        }
        average = total/ degree.length;
        System.out.printf("\n一週平均溫度 : %5.2f\n", average);
    }
}
