package ch09;

public class Ch09_08_03 {
    public static void main(String[] args) {
        Ch090803Math A = new Ch090803Math();
        A.addition(5, 10);
        A.addition(5,10, 15);
    }
}

class Ch090803Math {
    void addition(long x, int y) {
        System.out.println(x+y);
    }
    void addition(int x, int y, int z) {
        System.out.println(x+y+z);
    }
}