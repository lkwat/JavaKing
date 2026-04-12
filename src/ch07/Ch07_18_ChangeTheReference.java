package ch07;

public class Ch07_18_ChangeTheReference {
    public static void main(String[] args){
        int[] x = {6,9,2};
        System.out.println("原先X陣列內容 : ");
        for (int num:x){
            System.out.printf("%d\t", num);
        }
        System.out.println("\n更改參照和新的X陣列內容 : ");
        x = new int[2];
        x[0] = 10;
        x[1] = 20;
        for (int num:x){
            System.out.printf("%d\t", num);
        }
    }

}
