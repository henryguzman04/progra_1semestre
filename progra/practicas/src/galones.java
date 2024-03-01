import java.util.Scanner;
import java.util.SortedMap;

public class galones {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float PG,TG,GA;
        int L;
        System.out.println("Cantidad de litros que produce");
        L=he.nextInt();
        System.out.println("Precio del galón");
        PG=he.nextFloat();
        TG=(L/(float)3.785);
        GA=PG*TG;
        System.out.println("Ganancia por la entrega de leche: "+GA);

    }
}
