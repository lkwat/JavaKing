package ch07;

public class Ch07_06_SpecialDeclare1 {
    public static void main(String[] args){
        int x = 3;
        int [] z = new int[x];
        z[0] = z[1] = z[2] = 2;
        int sum = z[0] + z[1] + z[2];
        System.out.println("\nsum : " + sum);
    }
}
