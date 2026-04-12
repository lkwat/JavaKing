package ch07;
/*
宣告二維陣列x,並配置第一維空間(有2個元素)
印出x的元素數量
配置第二維空間(用for迴圈),(各有3個元素)
印出x[i]數量(用for迴圈)
*/
public class Ch07_23_Array_DeclareAndAssign3 {
    public static void main(String[] args){
        int[][] x = new int[2][];
        System.out.printf("x元素數量 : %d\n", x.length);

        for (int i=0; i<x.length; i++){
            x[i]= new int[3];
            System.out.printf("x[%d]元素數量 : %d\n", i, x[i].length);
        }
    }
}
