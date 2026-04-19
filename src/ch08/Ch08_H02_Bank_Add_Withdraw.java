package ch08;

public class Ch08_H02_Bank_Add_Withdraw {
    public static void main(String[] args) {
        Ch08_H02Bank myBank = new Ch08_H02Bank();
        myBank.account = 10000001;
        myBank.balance = 0;
        myBank.printInfo();
        System.out.printf("存款" + (myBank.saveMoney(100)?"成功\n":"失敗\n"));
        myBank.printInfo();
        System.out.printf("提款" + (myBank.withdrawMoney(90)?"成功\n":"失敗\n"));
        myBank.printInfo();
        System.out.printf("提款" + (myBank.withdrawMoney(20)?"成功\n":"失敗\n"));
        myBank.printInfo();
    }
}
class Ch08_H02Bank{
    int account;
    int balance;
    boolean saveMoney(int save) {
        if(save > 0) {
            balance += save;
            return true;
        }
        else {
            return false;
        }
    }
    boolean withdrawMoney(int withdraw) {
        if(withdraw>0 && withdraw<=balance) {
            balance -= withdraw;
            return true;
        }
        else {
            return false;
        }
    }

    void printInfo() {
        System.out.printf("帳戶 : %d, 餘額 : %d\n", account, balance);
    }

}