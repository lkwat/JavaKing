package practice;

public class P0425_01 {
    public static void main(String[] args) {
        P042501Student s1 = new P042501Student();
        s1.output();
        P042501Student s2 = new P042501Student("Bob");
        s2.output();
        P042501Student s3 = new P042501Student("Amy", 90);
        s3.output();
    }
}

class P042501Student {
    String name;
    int score;
    P042501Student() {
        this("NoName", 0);
    }
    P042501Student(String name) {
        this(name, 0);
    }
    P042501Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    void output() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
    }
}