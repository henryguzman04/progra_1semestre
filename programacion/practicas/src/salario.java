import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float HT ,PH, SS;
        System.out.println("Horas trabajadas");
        HT=he.nextFloat();
        System.out.println("Pago por hora");
        PH= he.nextFloat();
        SS=HT*PH;
        System.out.println("Sueldo semanal es: "+SS);
    }
}
