package ch09;

public class Ch09_08_04 {
    public static void main(String[] args) {
        Ch090804Math A = new Ch090804Math();
        A.addition(5,10);
    }
}

class Ch090804Math {
    void addition(int x, int y) {
        System.out.println("int 加法 : " + (x+y));
    }
    void addition(long x, long y) {
        System.out.println("long 加法 : " + (x+y));
    }
}