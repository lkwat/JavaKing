package ch09;

public class Ch09_H02 {
    public static void main(String[] args) {
        int NTdollar = 30000;
        Ch09H02TaipeiBank A = new Ch09H02TaipeiBank("Hung");
        A.saveMoney(5000);
        System.out.println("當存款是 5000\n" + NTdollar + "台幣可以兌換" + A.taiwan_to_usa(NTdollar) + " 美金");
        A.saveMoney(10000);
        System.out.println("當存款使15000\n" + NTdollar + "台幣可以兌換" + A.taiwan_to_usa(NTdollar) + " 美金");
    }
}

class Ch09H02TaipeiBank {
    private String name;
    private int balance;
    private double rate = 1.0 / 30;
    private double service_charge = 0.01;

    public Ch09H02TaipeiBank(String name) {
        this.name = name;
        balance = 0;
    }

    public void saveMoney(int money) {
        this.balance += money;
    }

    public void withdrawMoney(int money) {
        this.balance -= money;
    }

    public double taiwan_to_usa(int NTD) {
        if (this.balance >= 10000) {
            this.service_charge = 0.008;
        }
        return cal_rate(NTD);
    }

    private double cal_rate(int NTD) {
        double result;
        result = NTD * rate * (1 - service_charge);
        return result;
    }
}