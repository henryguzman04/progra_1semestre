import java.util.Scanner;

public class estatura4_5 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        int cont_pers=0;
        float est_pers=0,sum_est=0,pr=0;
        System.out.println("ingrese la estatura registrada en numero entero");
        est_pers= he.nextFloat();
        while (est_pers>0){
            sum_est=sum_est+est_pers;
            System.out.println("ingrese la estatura registrada en numero entero");
            est_pers= he.nextFloat();
            cont_pers++;
        }
        if(cont_pers==0){
            System.out.println("no hay estatura");
        }else{
            pr=sum_est/cont_pers;
        }
        System.out.println("el promedio de la estatura es : "+pr);
    }
}
