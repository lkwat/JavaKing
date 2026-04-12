package ch07;

public class Ch07_H02 {
    public static void main(String[] args){
        int[] x = {23, 99, 38, 9, 10, 22, 87, 25, 77};
        int tmp = 0;
        int min, max, middle;
        min = max = x[0];
        for(int i=0; i<x.length-1; i++){
            for(int j=0; j<x.length-1; j++){
                if (x[j]>x[j+1]){
                    tmp = x[j];
                    x[j]= x[j+1];
                    x[j+1]= tmp;
                }
            }
        }
        for (int element : x) {
            System.out.printf("%d\t", element);
            if (element > max)
                max = element;
            if (element < min)
                min = element;
        }
        System.out.printf("\n最大值 = %d\n", max);
        System.out.printf("最小值 = %d\n", min);
        if (x.length%2==0){
            middle = x.length / 2;
        }
        else {
            middle = (x.length+1) / 2;
        }
        System.out.printf("中間值 = %d", x[middle-1]);
    }
}
