import java.util.Scanner;

public class fabrica3_13 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        Scanner he2 = new Scanner(System.in);
        int clv;
        float cost_mat, cost_obra, gst_fab, cost_prod, prc_venta;
        System.out.println("cuanto se gasto en la materia prima:?");
        cost_mat = he.nextFloat();
        System.out.println("indique el numero de clave(1-6)");
        clv= he2.nextInt();
        if ((clv == 3) || (clv == 4)) {
            cost_obra=cost_mat*0.75f;
        }else if((clv==1)||(clv==5)){
            cost_obra=cost_mat*0.80f;
        }else{
            cost_obra=cost_mat*0.85f;
        }
        if((clv==2)||(clv==5)){
            gst_fab=cost_mat*0.30f;
        }else if((clv==3)||(clv==6)){
            gst_fab=cost_mat*0.35f;
        }else{
            gst_fab=cost_mat*0.28f;
        }
        cost_prod=cost_mat+cost_obra+gst_fab;
        prc_venta=cost_prod+(cost_prod*0.45f);
        System.out.println("el costo de produccion es: "+cost_prod);
        System.out.println("el precio de la venta es : "+prc_venta);

    }
}
