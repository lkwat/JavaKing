package practice;

public class P0426_04_ConstructorChaining_staticCount {
    public static void main(String[] args) {
        P0426StudentID s1 = new P0426StudentID();
        P0426StudentID s2 = new P0426StudentID("Amy");
        P0426StudentID s3 = new P0426StudentID("Bob");
        s1.output();
        s2.output();
        s3.output();
    }
}

class P0426StudentID {
    String name;
    int id;
    static int nextId = 1001;

    P0426StudentID() {
        this("NoName");
    }

    P0426StudentID(String name) {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    void output() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}