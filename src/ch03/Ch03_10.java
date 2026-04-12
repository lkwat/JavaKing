package ch03;

public class Ch03_10 {
    public static void main(String[] args){
        short x, y;
        /*
        x = 40000;
        System.out.println("數值超出變數可以容納的範圍" + x);
        y = -39999;
        System.out.println("數值超出變數可以容納的範圍" + y);
        */
        //以上為書上範例

        // x = 40000;   // 錯：超出 short 可容納範圍
        // y = -39999;  // 錯：超出 short 可容納範圍

        System.out.println("40000 與 -39999 都不能指定給 short");

    }
}
