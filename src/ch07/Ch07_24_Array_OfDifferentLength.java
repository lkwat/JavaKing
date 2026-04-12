package ch07;
/*
宣告二維陣列x,並先配置第1維陣列有2個元素
配置x[0]有3個元素
配置x[1]有2個元素
列印出x的元素數量
列印出x[i]的元素數量
設定二維陣列元素值
列印出二維陣列各個元素值
 */
public class Ch07_24_Array_OfDifferentLength {
    public static void main(String[] args){
        int[][] x = new int[2][];
        x[0] = new int[3];
        x[1] = new int[2];
        System.out.printf("x元素數量 : %d\n", x.length);
        for (int i=0; i<x.length; i++){
            System.out.printf("x[%d]元素數量 : %d\n", i, x[i].length);
        }
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;
        x[1][0] = 4;
        x[1][1] = 5;
        for (int j=0; j<x.length; j++){
            for (int k=0; k<x[j].length; k++){
                System.out.printf("x[%d][%d]=%d\n", j,k,x[j][k]);
            }
        }
    }
}
