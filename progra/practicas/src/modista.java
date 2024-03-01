import java.util.Scanner;

public class modista {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float CM,PG;
        System.out.println("Cantidad de metros que requiere");
        CM= he.nextFloat();
        PG=CM/2.54F;
        System.out.println("Pulgadas que debe pedir: "+PG);
    }
}
