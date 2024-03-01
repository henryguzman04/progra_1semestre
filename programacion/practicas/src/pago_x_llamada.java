import java.util.Scanner;

public class pago_x_llamada {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        Scanner he2 = new Scanner(System.in);
        Scanner he3 = new Scanner(System.in);
        int time;
        String tip_dia, trn;
        float pagTim, impuesto, TOT;


        System.out.println(" cuantos minutos duró la llamada");
        time = he.nextInt();

        if (time <= 5) {
            pagTim = time * 1;
        } else {
            if (time <= 8) {
                pagTim = (time - 5) * 0.8f + 5;
            } else {
                if (time <= 10) {
                    pagTim = (time - 8) * 0.7f + 7.4f;
                } else {
                    pagTim = (time - 10) * 0.5f + 8.8f;
                }
            }

        }   System.out.println("que dia de la semana es hoy");
        tip_dia = he3.nextLine();
        if (tip_dia .equals("DOM") ) {
            impuesto = pagTim * 0.05f;
        } else {
            System.out.println("ingrese si es turno matutino (M) o turno verspertino (v)");
            trn = he2.nextLine();
            if (trn == "M") {
                impuesto = pagTim * 0.15f;
            } else {
                impuesto = pagTim * 0.10f;
            }
        }
        TOT = pagTim + impuesto;
        System.out.println("el pago*tiempo a realizar es: " + pagTim);
        System.out.println("el impuesto es de: " + impuesto);
        System.out.println("el pago total a realizar es de: " + TOT);
    }
}


