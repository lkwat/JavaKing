package ch06;

public class Ch06_H05 {
    public static void main(String[] args){
        double weight = 50;
        int year;
        for(year=1; year<=10; year++){
            weight = weight+1.2;
            System.out.printf("第 %2d 年的體重 %.1f%n", year, weight);
        }
    }
}
