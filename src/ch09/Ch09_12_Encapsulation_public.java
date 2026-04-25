package ch09;

public class Ch09_12_Encapsulation_public {
    public static void main(String[] args) {
        Ch0912TaipeiBank A = new Ch0912TaipeiBank("Hung");
        A.get_balance();
        A.balance = 1000;  //unsafe, need encapsulation
        A.get_balance();
    }
}
class Ch0912TaipeiBank{
    String name;
    int balance;
    Ch0912TaipeiBank(String name) {
        this.name = name;
        this.balance = 0;
    }
    void get_balance(){
        System.out.println(name + " 目前存款餘額 " + balance);
    }
}