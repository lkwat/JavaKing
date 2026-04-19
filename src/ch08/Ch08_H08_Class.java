package ch08;

public class Ch08_H08_Class {
    public static void main(String[] args) {
        demoOverLoad obj = new demoOverLoad();
        obj.show('A');
        obj.show('B', 90);
    }
}
class demoOverLoad {
    void show(char ch) {
        System.out.println(ch);
    }
    void show (char ch, int n) {
        System.out.printf("%c %d\n", ch, n);
    }
}