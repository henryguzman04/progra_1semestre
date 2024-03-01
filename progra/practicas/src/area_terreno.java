import java.util.Scanner;

public class area_terreno {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float A,B,C,AT,AR,Area;
        System.out.println("Base del triángulo y del rectángulo");
        B= he.nextFloat();
        System.out.println("Altura del triángulo y rectángulo unidos");
        A= he.nextFloat();
        System.out.println("Altura del rectángulo");
        C= he.nextFloat();
        AT= ((A-C)*B)/2;
        AR= (B*C);
        Area=AT+AR;
        System.out.println("el area de esta figura es: "+Area);
    }
}
