package ch10;

import java.util.Random;

public class Ch10_H02 {
    public static void main(String[] args) {
        Random ran = new Random();
        for(int i=0; i<10; i++) {
            System.out.printf("%d ",ran.nextInt(1, 7));
        }
    }
}
