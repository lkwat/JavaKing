package ch08;

public class Ch08_18_ShadowingOfName {
    public static void main(String[] args) {
        ShadowingTest A = new ShadowingTest();
        A.printInfo(20);
    }
}

class ShadowingTest {
    int  x = 10;
    void printInfo(int x) {
        System.out.println("區域變數" +x);
        System.out.println("成員屬性" + this.x);
    }
}