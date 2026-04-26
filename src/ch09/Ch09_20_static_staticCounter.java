package ch09;

public class Ch09_20_static_staticCounter {
    public static void main(String[] args) {
        Ch0920NBAteam t1 = new Ch0920NBAteam();
        t1.name = "Durrant";
        t1.output();
        Ch0920NBAteam t2 = new Ch0920NBAteam();
        t2.name = "Curry";
        t2.output();
    }
}
class Ch0920NBAteam {
    public static int counter;
    public int id;
    public String name;
    static {
        counter = 0;
    }
    public Ch0920NBAteam() {
        id= ++counter;
    }
    public void output() {
        System.out.println("id: " + id + " Name: " + name);
        System.out.println("共有 " + counter + " 名成員");
    }
}