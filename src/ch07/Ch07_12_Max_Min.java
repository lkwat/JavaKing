package ch07;

public class Ch07_12_Max_Min {
    public static void main(String[] args){
        int [] score = {90, 95, 80, 79, 92};
        int max, min;
        max = min = score[0];

        for (int sc : score){
            if (sc > max)
                max = sc;
            if (sc < min)
                min = sc;
        }
        System.out.println("\nMax : " + max);
        System.out.println("Min : " + min);
    }
}
