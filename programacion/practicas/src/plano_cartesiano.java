import java.util.Scanner;

public class plano_cartesiano {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float x1,x2,y1,y2,x,y,d;
        System.out.println("abcisa1");
        x1= he.nextFloat();
        System.out.println("absisa2");
        x2= he.nextFloat();
        System.out.println("ordenada1");
        y1= he.nextFloat();
        System.out.println("ordenada2");
        y2= he.nextFloat();
        x=x2-x1;
        y=y2-y1;
        d=(float) Math.sqrt(Math.pow(2,x)+Math.pow(2,y));
        System.out.println("Distancia entre puntos es: "+d);
    }
}
