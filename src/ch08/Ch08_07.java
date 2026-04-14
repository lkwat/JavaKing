package ch08;
class Ch0807Bank{
    int account;
    int balance;
    void saveMoney(int save){
        balance += save;
    }
    void printInfo(){
        System.out.printf("帳戶 : %d, 餘額 : %5d\n", account, balance);
    }
}
public class Ch08_07 {
    public static void main(String[] args){
        Ch0807Bank A = new Ch0807Bank();
        A.account = 10000001;
        A.balance = 0;

        A.printInfo();
        A.saveMoney(100);
        A.printInfo();
    }
}
