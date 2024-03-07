import java.util.Scanner;

public class viajes_ABC {
    public static void main(String[] args) {
        Scanner he=new Scanner(System.in);
        Scanner he2=new Scanner(System.in);
        Scanner he3=new Scanner(System.in);
        String tip;
        int km,np;
        int num_per_real ;
        float c_km,cost_pers,ct;
        System.out.println("elige en que tipo de bus entraras?A,B,C");
        tip= he.nextLine();
        System.out.println("cuantos kilometros recorrió?");
        km=he2.nextInt();
        System.out.println("cuanto es el numero de personas que ingreso al autobus "+tip+" ?");
        num_per_real=he2.nextInt();
        if(tip.equals("A")){
            c_km=2.00f;
        }else if(tip.equals("B")){
            c_km=2.50f;
        }else{
            c_km=3.00f;
        }
        if(num_per_real<20){
            np=20;
        }else {
            np=num_per_real;
        }
        ct=np*c_km*km;
        cost_pers=ct/num_per_real;
        System.out.println("el costo toTal por persona es : "+cost_pers);
        System.out.println("el costo total del viale es: "+ct);

    }
}
