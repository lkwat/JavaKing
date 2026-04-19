package ch08;

public class Ch08_H04_AnonymousArray {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println("總和  = " + add(numbers));
        System.out.println("平均值 = " + average(numbers));
        System.out.println("最大值 = " + max(numbers));
        System.out.println("最小值 = " + min(numbers));
    }
    public static int add(int[] nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }
    public static double average(int[] nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return (double)sum/ nums.length;
    }
    public static int max(int[]nums){
        int max = nums[0];
        for (int num : nums){
            if (num>max)
                max=num;
        }
        return max;
    }
    public static int min(int[]nums){
        int min = nums[0];
        for (int num : nums){
            if (num<min)
                min=num;
        }
        return min;
    }
}

