import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int a,b,m;
        System.out.println("ingrese el primer digito; ");
        a=he.nextInt();
        System.out.println("ingrese el segundo digto: ");
        b=he.nextInt();
        if(a>b){
            m=a;
        }else{
            m=b;

        }
        System.out.println("el mayor es: "+m);
    }
}
