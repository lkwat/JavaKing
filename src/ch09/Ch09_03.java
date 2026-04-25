package ch09;

public class Ch09_03 {
    public static void main(String[] args){
        Ch0903TaipeiBank A = new Ch0903TaipeiBank();
        A.printBalance();
    }
}
class Ch0903TaipeiBank {
    int balance;
    Ch0903TaipeiBank(){
        balance = 0;
    }
    void printBalance(){
        System.out.println("存款餘額: " + balance);
    }
}