package Ch10;

public class Ch10_12 {
    public static void main(String[] args) {
        double rad = 0;
        for(int deg = 0; deg<=360; deg+=45) {
            rad = Math.toRadians(deg);
            System.out.printf("角度%4d \t sin(%5.3f)= %11.8f   cos(%5.3f) = %11.8f\n",
                                deg, rad, Math.sin(rad), rad, Math.cos(rad));
        }
    }
}
