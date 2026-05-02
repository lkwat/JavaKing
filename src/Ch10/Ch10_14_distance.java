package Ch10;

public class Ch10_14_distance {
    public static void main(String[] args) {
        double r = 6371;    //the radius of the Earth
        double x1 = 22.2838;
        double y1 = 114.1731;
        double x2 = 25.0452;
        double y2 = 121.5168;
        double d;
        d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+
                          Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
                          Math.cos(Math.toRadians(y1-y2)));
        System.out.println("distance = " + d);
    }
}
