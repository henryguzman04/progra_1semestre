import java.util.Scanner;

public class valor_mayor_num {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int a,b,c,m;
        System.out.println("introduce el 1º numero");
        a=he.nextInt();
        System.out.println("introduce el 1º numero");
        b=he.nextInt();
        System.out.println("introduce el 1º numero");
        c=he.nextInt();
        if(a>b){
            if(a>c){
                m=a;
            }else{
                m=c;
            }
        }else{
            if(b>c){
                m=b;
            }else{
                m=c;
            }
        }
        System.out.println("el numero mayor es: "+m);

    }
}
