package ch08;
class DataBank {
    int x, y;
}

public class Ch08_09_SwapSuccess_CallByAddress {
    public static void swap(DataBank B) {
        int tmp = B.x;
        B.x = B.y;
        B.y = tmp;
        System.out.printf("swap方法內部 x = %d, y = %d\n", B.x, B.y);
    }

    public static void main(String[] args) {
        DataBank A = new DataBank();
        A.x = 10;
        A.y = 20;
        System.out.printf("呼叫swap方法前 x = %d, y = %d\n", A.x, A.y);
        swap(A);
        System.out.printf("呼叫swap方法後 x = %d, y = %d\n", A.x, A.y);
    }
}