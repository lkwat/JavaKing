package ch07;

public class Ch07_17_ReferenceDataTypes {
    public static void main(String[] args){
        int [] score = {90, 79, 92};
        int [] myscore = score;

        System.out.printf("score[1]   = %d\n", score[1]);
        System.out.printf("myscore[1] = %d\n", myscore[1]);

        myscore[1] = 100;
        System.out.println("更改myscore[1]內容後");
        System.out.printf("score[1]   = %d\n", score[1]);
        System.out.printf("myscore[1] = %d\n", myscore[1]);
    }
}
