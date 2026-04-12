package ch07;

public class Ch07_11_ForEach2 {
    public static void main(String[] args){
        double [] score = {90, 95, 80, 79, 92};
        double total = 0;
        System.out.println();
        for (double sc : score){
            total += sc;
        }
        double average = total/ score.length;
        System.out.printf("average : %5.2f\n", average);
    }
}
