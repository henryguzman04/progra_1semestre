import java.util.*;

public class area_circunferencia {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float R,PI,Area;
        PI=(float)3.1416;
        System.out.println("intriuduce el valoe de la radio: ");
        R= he.nextFloat();
        Area= (float) (PI*Math.pow(2,R));
        System.out.println("el area de la circunferencia es: "+Area);
    }
}
