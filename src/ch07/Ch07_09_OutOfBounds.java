package ch07;

public class Ch07_09_OutOfBounds {
    public static void main(String[] args){
        int [] z = new int[3];
        z[0] = z[1] = z[2] = z[3];
        int sum = z[0] + z[1] + z[2] + z[3];
        System.out.println("\nsum = " + sum);
    }
}
