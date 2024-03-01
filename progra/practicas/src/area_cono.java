import java.util.Scanner;

public class area_cono {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float R,H,C,PI,AT,AC,Area;
        PI=(float) 3.1416;
        System.out.println("Base del triángulo rectángulo y radio");
        R=he.nextFloat();
        System.out.println("Hipotenusa del triángulo rectángulo");
        H= he.nextFloat();
        C= (float) Math.sqrt((Math.pow(2,H))-(Math.pow(2,R)));
        AT= 2 * ((R * C) / 2);
        AC= (float) ((PI*Math.pow(2,R)))/2;
        Area=AT+AC;
        System.out.println("el area de esta figura es: "+Area);
    }
}
