package ch07;

public class Ch07_H01 {
    public static void main(String[] args){
        int[] x = {23, 33, 43, 53, 63, 73};
        int sum = 0;
        double average = 0;
        System.out.print("相反順序輸出: ");
        for (int i=x.length-1; i>=0; i--){
            System.out.printf("%d ", x[i]);
            sum = sum + x[i];
        }
        average = (double)sum/x.length;
        System.out.printf("\n總和 = %d\n", sum);
        System.out.printf("平均 = %6.2f", average);
    }
}
