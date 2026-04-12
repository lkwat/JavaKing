package ch07;
/*
宣告x為整數的二維陣列
配置x有2行3列
印出x的行的元素數量
印出x的列的元素數量
 */
public class Ch07_19_TwoDim_Array {
    public static void main(String[] args){
        int[][] x;
        x = new int[2][3];
        System.out.printf("x 元素數量 : %d\n", x.length);
        for (int i=0; i< x.length; i++) {
            System.out.printf("x[%d]元素數量 : %d\n", i, x[i].length);
        }
/*      int[][] x;
        x = new int[2][3];
        System.out.println("x 元素數量 : " + x.length);
        for(int i=0; i<2; i++){
            System.out.printf("x[%d] 元素數量 : %d\n", i, x[i].length);
        }
*/    }
}
