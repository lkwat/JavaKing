package ch09;

public class Ch09_10_this_02 {
    public static void main(String[] args) {
        Ch091002NBAPlayers A = new Ch091002NBAPlayers("LeBron James", 30);
        A.printInfo();
    }
}

class Ch091002NBAPlayers {
    int age = 28;
    String name;

    Ch091002NBAPlayers(String name) {
        this.name = name;
    }

    Ch091002NBAPlayers(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}