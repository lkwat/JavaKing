package ch08;

public class Ch08_20_ShadowingOfName {
    public static void main(String[] args) {
        Ch0820Bank bank = new Ch0820Bank();
        bank.account = 10000001;
        bank.balance = 0;

        bank.printInfo();
        bank.saveMoney(100);
        bank.printInfo();
    }
}

class Ch0820Bank {
    int account;
    int balance;
    void saveMoney(int balance) {
        this.balance = this.balance + balance;
    }
    void printInfo(){
        System.out.printf("帳戶 : %d, 餘額 : %d\n", account, balance);
    }
}