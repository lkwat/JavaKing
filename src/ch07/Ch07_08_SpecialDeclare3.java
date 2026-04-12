package ch07;

public class Ch07_08_SpecialDeclare3 {
    public static void main(String[] args){
        int x = 3;
        int y = 5;
        int [] z = {1, 2, x+y};
        int sum = z[0] + z[1] + z[2];
        System.out.println("\nsum : " + sum);
    }
}
