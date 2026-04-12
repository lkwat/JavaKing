package ch06;

public class Ch06_H02 {
    public static void main(String[] args){
        int i;
        int sum=0;
        for(i=1; i<=100; i++){
            if (i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }

}
