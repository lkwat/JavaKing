package ch07;

public class Ch07_15_BubbleSort_Efficient {
    public static void main(String[] args){
        int [] score = {90, 58, 80, 49,92};
        int tmp;

        for (int i=0; i < (score.length-1); i++) {
            for (int j=0; j < (score.length-i-1); j++) {
                if (score[j] < score[j+1]){
                    tmp = score[j];
                    score[j] = score[j+1];
                    score[j+1] = tmp;
                }
            }
            System.out.printf("第 %d 次 bubble sort 迴圈排序結果 : \n", i+1);
            for (int sr : score){
                System.out.printf("%d\t", sr);
            }
            System.out.println();
        }

    }
}
