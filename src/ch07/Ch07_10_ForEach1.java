package ch07;

public class Ch07_10_ForEach1 {
    public static void main(String[] args){
        int [] numList = {5, 15, 10};
        System.out.println();
        for (int num : numList){
            System.out.println("numList" + num);
        }
    }
}
