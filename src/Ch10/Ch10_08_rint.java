package Ch10;

public class Ch10_08_rint {
    public static void main(String[] args) {
        double x1 = -3.499;
        double x2 = -3.51;
        System.out.println("-3.499的rint()值是 : " + Math.rint(x1));
                            //取最接近的整數；如果剛好是 .5，就取最接近的偶數。
        System.out.println("-3.51的rint()值是 : " + Math.rint(x2));
                            //取最接近的整數；如果剛好是 .5，就取最接近的偶數。
        double y1 = 5.5;
        double y2 = 4.5;
        System.out.println("5.5的rint()值是 : " + Math.rint(y1));
        System.out.println("4.5的rint()值是 : " + Math.rint(y2));
    }
}
