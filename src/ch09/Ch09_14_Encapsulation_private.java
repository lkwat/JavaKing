package ch09;

public class Ch09_14_Encapsulation_private {
    public static void main(String[] args) {
        Ch0914TaipeiBank A = new Ch0914TaipeiBank("Hung");
        A.get_balance();
        A.saveMoney(1000);
        A.get_balance();
        A.withdraw(500);
        A.get_balance();
    }
}

class Ch0914TaipeiBank {
    private String name;
    private int balance;

    public Ch0914TaipeiBank(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void saveMoney(int money) {
        this.balance += money;
    }

    public void withdraw(int money) {
        this.balance -= money;
    }

    public void get_balance() {
        System.out.println(name + "  目前存款餘額: " + balance);
    }
}