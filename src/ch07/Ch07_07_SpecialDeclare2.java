package ch07;

public class Ch07_07_SpecialDeclare2 {
    public static void main(String[] args){
        int x = 3;
        int y = 5;
        int [] z = new int[y-x];
        z[0] = z[1] = 2;
        int sum = z[0] + z[1];
        System.out.println("\nsum : " + sum);
    }
}
