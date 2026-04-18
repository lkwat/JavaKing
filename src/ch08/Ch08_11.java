package ch08;

class Ch0811SmallMath {
    int add (int x, int y) {
        int z = x + y;
        return z;
    }
    int sub (int x, int y) {
        return x - y;
    }
}
public class Ch08_11 {
    public static void main(String[] args) {
        Ch0811SmallMath A = new Ch0811SmallMath();
        System.out.println(A.add(10, 20));
        System.out.println(A.sub(10, 20));
    }
}
