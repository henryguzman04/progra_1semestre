import java.util.Scanner;

public class pago_de_alumnos {
    public static void main(String[] args) {
        int NA ;
                float PA,TOT;
        Scanner he =new Scanner(System.in);
        System.out.println("ingrese la cantidad de alumnos que iran de viaje");
        NA= he.nextInt();
        if(NA>=100){
            PA=65;
        }else {
            if(NA>=50 && NA<=99){
                PA=70;
            }else{
                if(NA>=30 && NA<=49){
                    PA=95;

                }else{
                    PA= (int) (4000/NA);

                }
            }

        }
        TOT= PA*NA;
        System.out.println("el pago individual es: "+PA);
        System.out.println("el pago total es: "+TOT);
    }

}
