import java.util.Scanner;

public class determinar_signo {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int num;
        String r;
        System.out.println("introduce un numero positivo/negativo");
         num=he.nextInt();
        if(num>=0){
            r="positivo";
        } else {
            r="negativo" ;
        }
        System.out.println("el numero tiene signo "+r);
    }
}
