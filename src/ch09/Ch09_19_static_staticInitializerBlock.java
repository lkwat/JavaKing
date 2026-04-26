package ch09;

public class Ch09_19_static_staticInitializerBlock {
    public static void main(String[] args) {
        Ch0919NBAteam t1 = new Ch0919NBAteam("Curry");
        Ch0919NBAteam t2 = new Ch0919NBAteam("Durant");
        t1.output();
        t2.output();
        Ch0919NBAteam.team = "Golden State";
        t1.output();
        t2.output();
    }
}
class Ch0919NBAteam {
    public static String team;
    public String name;
    static {
        team = "Warriors";
    }
    public Ch0919NBAteam(String name) {
        this.name = name;
    }
    public void output() {
        System.out.println("Team: " + team);
        System.out.println("Name: " + name);
    }
}