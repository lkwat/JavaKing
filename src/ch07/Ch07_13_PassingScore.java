package ch07;

public class Ch07_13_PassingScore {
    public static void main(String[] args){
        int [] score = {90, 58, 80, 49, 92};
        int passingScore = 60;
        System.out.println();
        for (int i=0; i<score.length; i++){
            if (score[i] < passingScore){
                System.out.println("第 " + (i+1) +" 位同學不及格，成績 " + score[i] + " 分!");
            }
        }

    }
}
