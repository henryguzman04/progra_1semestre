import java.util.Scanner;

public class Hamburguesas3_11 {
    public static void main(String[] args) {
        Scanner he=new Scanner(System.in);
        Scanner he2=new Scanner(System.in);

        String tip_hamb,tip_pag;
        int num_hamb;
        float precio_hamb,carg_tarj,tot_nCarg,tot_carg;
        System.out.println("que tipo de hamburguesa va a pedir?");
        System.out.println("hamburguesa sencilla (A),hamburguesas dobles (B),hamburguesas triples(C)");
        tip_hamb=he.nextLine();
        System.out.println("cuantas hamburguesas pedirá?: ");
        num_hamb=he2.nextInt();
        System.out.println("elija forma de pago que realizará: ");
        System.out.println("con tarjeta (TJ) o efectivo (EF)");
        tip_pag=he.nextLine();
        if(tip_hamb.equals("A")){
          precio_hamb=20.00f;
        }else if(tip_hamb.equals("B")){
            precio_hamb=25.00f;
        }else{
            precio_hamb=28.00f;
        }
        if(tip_pag.equals("TJ")){
            carg_tarj=num_hamb*precio_hamb*0.05f;
        }else{
            carg_tarj=0;
        }
        tot_nCarg=num_hamb*precio_hamb;
        tot_carg=tot_nCarg+carg_tarj;
        System.out.println("el precio total sin cargo alguno es: "+tot_nCarg);
        System.out.println("el precio total con cargo es : "+tot_carg);
        System.out.println("el precio de la hamburguesa por unidad es ? : "+precio_hamb);


    }
}
