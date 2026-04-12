package ch07;

public class Ch07_21_Array_DeclareAndAssign {
    public static void main(String[] args){
        int[][] x = {{1,2,3},{4,5,6}};

        System.out.println(x.length);

        for(int i=0; i<x.length; i++){
            for(int j=0; j<x[i].length; j++){
                System.out.printf("x[%d][%d] = %d\t", i,j,x[i][j]);
            }
            System.out.println();
        }
    }
}
