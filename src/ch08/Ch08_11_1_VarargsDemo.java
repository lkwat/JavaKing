package ch08;
class Ch081101SmallMath {
    int add (int x, int...y) {
        int total = x;
        for (int num:y){
            total +=num;
        }
        return total;
    }
}
public class Ch08_11_1_VarargsDemo {
    public static void main(String[] args) {
        Ch081101SmallMath A = new Ch081101SmallMath();
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(A.add(1,3));
        System.out.println(A.add(1,3, 5));
        System.out.println(A.add(5, values));
    }
}
