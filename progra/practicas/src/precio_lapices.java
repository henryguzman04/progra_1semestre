import java.util.Scanner;

public class precio_lapices {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int x;
        float PAG;
        System.out.println("introduce la cantidad de lapises que desea comprar: ");
        x=he.nextInt();
        if(x>=1000){
            PAG=x*0.85f;
        }else{
            PAG=x*0.90f;
        }
        System.out.println("el pago realializado es: "+PAG);

    }
}
