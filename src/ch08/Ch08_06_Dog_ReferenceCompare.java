package ch08;

//物件變數存的是參考，不是物件本身
//Ch0806Dog aDog = new Ch0806Dog();
//aDog 裡面存的是物件在記憶體的地址，不是物件本身。

//== 比較的是參考，不是內容
//aDog == bDog  // false，兩個不同的記憶體地址
//就算名字都是 Lily，因為是不同物件，== 還是 false。

//兩個變數可以指向同一個物件
//bDog = cDog;  // bDog 和 cDog 現在指向同一個物件
//bDog.name = "Hali";  // 改 bDog，cDog 也跟著變！
//這是最重要的觀念，因為它們共享同一個物件，修改一個另一個也會變

class Ch0806Dog {
    String name = "Lily";

    void printInfo() {
        System.out.println("狗名字是 : " + name);
    }
}

public class Ch08_06_Dog_ReferenceCompare {
    public static void main(String[] args) {
        Ch0806Dog aDog, bDog, cDog;
        aDog = new Ch0806Dog();
        bDog = new Ch0806Dog();
        cDog = new Ch0806Dog();
        System.out.println("aDog == bDog : " + (aDog == bDog) + " aDog.name : " + aDog.name + "  bDog.name : " + bDog.name);
        System.out.println("aDog == cDog : " + (aDog == cDog) + " aDog.name : " + aDog.name + "  cDog.name : " + cDog.name);
        System.out.println("bDog == cDog : " + (bDog == cDog) + " bDog.name : " + bDog.name + "  cDog.name : " + cDog.name);

        bDog = cDog;
        System.out.println("bDog == cDog : " + (bDog == cDog) + "  bDog.name : " + bDog.name + "  cDog.name : " + cDog.name);

        bDog.name = "Hali";

        aDog.printInfo();
        bDog.printInfo();
        cDog.printInfo();
    }
}
