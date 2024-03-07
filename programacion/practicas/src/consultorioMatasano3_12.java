import java.util.Scanner;

public class consultorioMatasano3_12 {
    public static void main(String[] args) {
        Scanner he=new Scanner(System.in);
        int num_conslt;
        float cost_cita,cost_tratm;
        System.out.println("que numero de citas ya asistió? ");
        num_conslt=he.nextInt();
        if(num_conslt<=3){
            cost_cita=200;
            cost_tratm=num_conslt*cost_cita;
        }else if(num_conslt<=5){
            cost_cita=150;
            cost_tratm=((num_conslt-3)*150+600);
        }else if(num_conslt<=8){
            cost_cita=100;
            cost_tratm=(num_conslt-5)*100+900;
        }else{
            cost_cita=50;
            cost_tratm=(num_conslt-8)*50+1200;
        }
        System.out.println("el costo de la cita fue : "+cost_cita);
        System.out.println("el total del tratamiento es de : "+cost_tratm);
    }
}
