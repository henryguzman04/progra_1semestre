import java.util.Scanner;

public class examenes {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        float c1;
        float c2;
        float c3;
        float c4;
        float p;
        System.out.println("introduce el 1º digito");
        c1=he.nextFloat();
        System.out.println("introduce el 2º digito");
        c2= he.nextFloat();
        System.out.println("introduce el 3º digito");
        c3= he.nextFloat();
        System.out.println("introduce el 4º digito");
        c4= he.nextFloat();
        p=(c1+c2+c3+c4)/4;
        System.out.println("el promedio final es :"+p);
    }
}
