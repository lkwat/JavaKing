package practice;

public class P0426_05_ConstructorChaining_staticCount {
    public static void main(String[] args) {
        P0426Account a1 = new P0426Account();
        P0426Account a2 = new P0426Account("Peter");
        P0426Account a3 = new P0426Account("Amy", 5000);
        a1.output();
        a2.output();
        a3.output();
    }
}

class P0426Account {
    String owner;
    int balance;
    static int count;
    P0426Account(){
        this("Unknown", 0);
    }
    P0426Account(String owner) {
        this(owner, 0);
    }
    P0426Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        count++;
    }
    void output() {
        System.out.println("帳戶: " + owner);
        System.out.println("存款餘額: " + balance);
        System.out.println("總帳戶數: " + count);
    }
}