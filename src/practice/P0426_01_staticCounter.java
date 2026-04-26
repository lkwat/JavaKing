package practice;

public class P0426_01_staticCounter {
    public static void main(String[] args) {
        P042601Student s1 = new P042601Student();
        P042601Student s2 = new P042601Student("Bob");
        P042601Student s3 = new P042601Student("Amy", 90);
        s1.output();
        s2.output();
        s3.output();
    }
}

class P042601Student {
    String name;
    int score;
    static int count;

    P042601Student() {
        this("NoName", 0);// 呼叫 P042601Student(String name, int score) 這個建構子，使用預設值 "NoName" 和 0。
                                      //this(...) 如果出現在 constructor 裡，一定要放第一行。
    }

    P042601Student(String name) {
        this(name, 0); //如果使用者只給名字，沒有給分數，那分數預設成 0，然後交給最完整的 constructor 處理。
    }

    P042601Student(String name, int score) {
        this.name = name;
        this.score = score;
        count++;
    }

    void output() {
        System.out.println("Name: " + name);
        System.out.println("Score: " + score);
        System.out.println("Total student: " + count);
    }
}