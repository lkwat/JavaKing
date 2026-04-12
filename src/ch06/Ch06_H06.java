package ch06;

public class Ch06_H06 {
    public static void main(String[] args){
        int column, row;
        for (row=0; row<=9; row++){
            for (column=0; column<=9; column++){
                if(column<=9-row){
                    System.out.print("*");
                }
            }
        System.out.println();
        }
    }
}
