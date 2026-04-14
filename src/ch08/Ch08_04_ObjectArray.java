package ch08;
class TaipeiBank {
    int account;
    int balance;
    void printInfo(){
        System.out.printf("帳戶 : %d, 餘額 : %d\n", account, balance);
    }
}
public class Ch08_04_ObjectArray {
    public static void main(String[] args){
        TaipeiBank[] shillin = new TaipeiBank[5];

        for (int i=0; i<shillin.length; i++){
            shillin[i] = new TaipeiBank();
            shillin[i].account = 10000013 +i;
            shillin[i].balance = 0;
        }
        for (TaipeiBank sh:shillin){
            sh.printInfo();
        }
    }
}
