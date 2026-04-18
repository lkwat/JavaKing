package ch08;

class Ch0810TaipeiBank {
    int account;
    int balance;
    Boolean saveMoney(int save){
        if (save>0){
            balance += save;
            return true;
        }
        else {
            return false;
        }
    }
    void printInfo () {
        System.out.printf("帳戶 : %d 餘額 : %d\n", account, balance);
    }
}
public class Ch08_10_Return_Value {
    public static void main (String[] args) {
        Ch0810TaipeiBank A = new Ch0810TaipeiBank();
        A.account = 1000001;
        A.balance = 0;

        A.printInfo();
        System.out.println("存款" +
                ((A.saveMoney(100)) ? "成功":"失敗"));
        A.printInfo();
        System.out.println("存款" +
                ((A.saveMoney(-100))? "成功":"失敗"));
        A.printInfo();
    }
}
