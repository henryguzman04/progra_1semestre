import java.util.Scanner;

public class N_cantidades4_7 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        Scanner he2 = new Scanner(System.in);
        int cantd_leer,cant_p=0,cantd_n=0;
        float num_cantd;
        System.out.println("introduzca una cantidad 'N' de numeros enteros");
        num_cantd= he.nextFloat();
        for(int i=1 ;i<=num_cantd;i++){
            System.out.println("introduzca la cantidad"+i+" en numeros enteros");
            cantd_leer= he2.nextInt();
            if(cantd_leer<=0){
                cantd_n=cantd_n+1;
            }else {
                cant_p=cant_p+1;
            }

        }
        System.out.println("la cantidad positiva es : "+cant_p);
        System.out.println("la cantidad negativa es : "+cantd_n);


    }
}
