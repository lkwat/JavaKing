package practice;

public class P0419_02_CountEven {
    public static void main(String[] args) {
        System.out.println(countEven(new int[]{1, 2, 3, 4, 5, 6, 8}));
    }

    public static int countEven(int[] nums) {
        int count = 0;
        for(int num:nums){
            if(num%2==0) {
                count++;
            }
        }
        return count;
    }
}
