package ch06;

public class Ch06_H07 {
    public static void main(String[] args){
        int column;
        int row;
        for(row=9; row>=0; row-- ){
            for(column=0; column<=row; column++){
                System.out.printf("%d", 9-column);
            }
        System.out.println();
        }
    }
}
