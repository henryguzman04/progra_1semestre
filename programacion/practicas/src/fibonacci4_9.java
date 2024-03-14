import java.util.Scanner;

public class fibonacci4_9 {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        int A=0,B=1,val,num,cont=0;
        System.out.println("ingrese la cantidad de numeros a saber");
        num=he.nextInt();
        for (cont=1;cont<=num;cont++){
           val=A+B;
            System.out.println("el "+cont+"° numero es= "+val);
            A=B;
            B=val;
        }
    }
}
