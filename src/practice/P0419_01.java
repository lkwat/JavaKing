package practice;

public class P0419_01 {
    public static void main(String[] args) {
        System.out.println(max(new int[]{8, 3, 15, 2, 10}));
    }

    public static int max(int[] nums) {
        int max= nums[0];
        for(int num:nums){
            if(num>max)
                max=num;
        }
        return max;
    }
}
