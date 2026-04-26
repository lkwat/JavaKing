package practice;

public class P0426_03_ConstructorChaining_staticCount {
    public static void main(String[] args) {
        P0426GamePlayer p1 = new P0426GamePlayer();
        P0426GamePlayer p2 = new P0426GamePlayer("Alice");
        P0426GamePlayer p3 = new P0426GamePlayer("Bob", 5);
        P0426GamePlayer p4 = new P0426GamePlayer("Cindy", 10);

        p1.output();
        p2.output();
        p3.output();
        p4.output();
    }
}

class P0426GamePlayer {
    String name;
    int level;
    static int playerCount;

    P0426GamePlayer() {
        this("guest", 1);
    }
    P0426GamePlayer(String name) {
        this(name, 1);
    }
    P0426GamePlayer(String name, int level) {
        this.name = name;
        this.level = level;
        playerCount++;
    }
    void output() {
        System.out.println("Name: " + name);
        System.out.println("level: " + level);
        System.out.println("共有 " + playerCount + " 位玩家");
    }
}