package ch07;

public class Ch07_28_TwoDim_AveTemp_StrArray {
    public static void main(String[] args){
        String[] str = {"最高溫平均: ", "平均溫平均: ", "最低溫平均: "};
        int[][] degree = {{25, 27, 29, 28, 26, 30, 28},
                          {23, 25, 27, 26, 24, 28, 26},
                          {21, 23, 25, 24, 22, 26, 24}};
        double sum, average;
        for (int i=0; i< degree.length; i++){
            sum = 0;
            for (int element:degree[i]){
                sum = sum + element;
            }
            average = sum/degree[i].length;
            System.out.printf("%s %5.2f\n", str[i], average);
        }

    }
}
