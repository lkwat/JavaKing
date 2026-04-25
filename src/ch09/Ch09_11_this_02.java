package ch09;

public class Ch09_11_this_02 {
    public static void main(String[] args) {
        Ch091102NBAPlayers A = new Ch091102NBAPlayers("LaBron", 30);
        A.printInfo();
    }
}

class Ch091102NBAPlayers {
    int age;
    String name;

    Ch091102NBAPlayers(String name) {
        this.name = name;
    }

    Ch091102NBAPlayers(String name, int age) {
        this(name);
        this.age = age;
    }

    void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}