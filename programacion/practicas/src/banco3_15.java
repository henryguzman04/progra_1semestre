import java.util.Scanner;

public class banco3_15 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        int tip_trj;
        float limt_actl_crt,aum_crt=1,nuevo_lim_crt;
        System.out.println("que tipo de tarjeta tiene?\ntipo1(1),tipo1(2),tipo1(3),otro tipo(4)");
        tip_trj= he.nextInt();
        System.out.println("cual es su limite de credito a prosesar?");
        limt_actl_crt= he.nextFloat();
        switch (tip_trj){
            case 1:

                aum_crt=limt_actl_crt*0.25f;
                break;
            case 2:
                aum_crt=limt_actl_crt*0.35f;
                break;
            case 3:
                aum_crt=limt_actl_crt*0.40f;
                break;
            case 4:
                aum_crt=limt_actl_crt*0.50f;
                break;
            default:
                System.out.println("no existe el tipo de tarjeta que esta solicitando");


        }if(tip_trj>=5){
            //nada
        }else{
            nuevo_lim_crt=limt_actl_crt+aum_crt;
            System.out.println("su nuevo aumento de credito sera : "+nuevo_lim_crt);}


    }
}
