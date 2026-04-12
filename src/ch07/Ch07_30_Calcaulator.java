package ch07;

public class Ch07_30_Calcaulator {
    public static void main(String[]args){
        if(args.length !=3){
            System.out.println("請使用這個公式處理 Operand1 operator operand2");
            System.exit(0);
        }
        int ans = 0;

        switch (args[1].charAt(0)){
            case '+' : ans = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                       break;
            case '-' : ans = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                       break;
            case '*' : ans = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                       break;
            case '/' : ans = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                       break;
        }
        System.out.printf("%s %s %s = %d%n", args[0], args[1], args[2], ans );
    }
}
