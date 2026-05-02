package ch10;

public class Ch10_10_otherMath {
    public static void main(String[] args) {
        double x = 4.0;
        System.out.println("sqrt(4.0)值是: " +Math.sqrt(x));
        x = 8.0;
        System.out.println("cbrt(8.0)值是: " +Math.cbrt(x));
        x = 3.0;
        System.out.println("pow(3.0, 4)值是: " + Math.pow(3.0, 4));
        x=2.0;
        System.out.println("exp(2.0)值是: " + Math.exp(x));  //自然對數 e 的 x 次方值;
        x=2.7;
        System.out.println("log(2.7)值是: " + Math.log(x));
        x=10.0;
        System.out.println("log10(10.0)值是: " + Math.log10(x));
    }
}
