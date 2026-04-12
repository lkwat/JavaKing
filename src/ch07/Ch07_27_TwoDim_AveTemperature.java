package ch07;
public class Ch07_27_TwoDim_AveTemperature {
    public static void main(String[] args){
        int[][] degree = {{25, 27, 29, 29, 26, 30, 28},
                          {23, 25, 27, 26, 24, 28, 26},
                          {21, 23, 25, 24, 22, 26, 24}
        };
        double sum, average;
        String str = "";
        sum = 0;
        for (int i=0; i < degree.length; i++){
            sum = 0;
            for (int element : degree[i]){
                sum = sum + element;
            }
            average = sum / degree[i].length;
            switch (i){
                case 0 :
                    str = "最高溫平均: ";
                    break;
                case 1 :
                    str = "平均溫平均: ";
                    break;
                case 2 :
                    str = "最低溫平均: ";
                    break;
            }
            System.out.printf("%s %5.2f\n", str,average);
        }
    }
}

