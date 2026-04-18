package ch08;

public class Ch08_15_LocalVariable {
    public static void main(String[] args){
        int x = 10;
        System.out.println("main內的變數x = " + x);
        {
            int y = 20;
            System.out.println("main宣告的變數x = " + x);
            System.out.println("區塊內的變數y = " + y);
        }
    }
}
