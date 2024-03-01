import java.sql.SQLOutput;
import java.util.Scanner;

public class pago_H2O {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float A,L,N,CM,V,PAG;
        System.out.println("Altura de la alberca");
        A=he.nextFloat();
        System.out.println("Largo de la alberca");
        L= he.nextFloat();
        System.out.println("Ancho de la alberca");
        N= he.nextFloat();
        System.out.println("Costo del metro cúbico");
        CM=he.nextFloat();
        V=A*L*N;
        PAG=V*CM;
        System.out.println("Pago a realizar por el consumo es: "+PAG);
    }
}
