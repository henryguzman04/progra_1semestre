import java.util.Scanner;

public class trabajadores4_15 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        Scanner he2 = new Scanner(System.in);
        int num_trbj,sum_hrs_s=0,dias_lab=0;
        float hrs_trjs,pagxhrs,ss,tot=0;
        System.out.println("ingrese la cantidad de trabajadores");
        num_trbj=he.nextInt();
        for (int i=1;i<=num_trbj;i++){
            System.out.println("ingrese los dias laborados del trabajador "+i);
            dias_lab=he.nextInt();
            System.out.println("ingrese la cantidad de pago por hora");
            pagxhrs=he2.nextFloat();

            for (int d=1;d<=dias_lab;d++){
                System.out.println("ingrese las horas trabajadas del dia "+d);
                hrs_trjs=he2.nextFloat();
                sum_hrs_s= (int) (sum_hrs_s+hrs_trjs);
            }

            ss=sum_hrs_s*pagxhrs;
            System.out.println("el sueldo del trabajador"+i+" es: "+ss);
            tot=tot+ss;
        }
        System.out.println("el total que se pago es: "+tot);
    }
}
