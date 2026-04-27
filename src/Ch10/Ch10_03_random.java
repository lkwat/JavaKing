package Ch10;

public class Ch10_03_random {
    public static void main(String[] args) {
        int[] dice = new int[10];

        for (int i=0; i<10; i++) {
            dice[i] = (int)(Math.random()*(6-1+1))+1;
            System.out.printf("%d \t", dice[i]);
        }
    }
}
