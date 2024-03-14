import java.util.Scanner;

public class cambio_pocicion5_6 {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int vector[]=new int[6];
        int aux;

        for (int i = 0; i < 6; i++) {
            System.out.println("vector posision "+i);
         vector[i]= he.nextInt();
        }

        for (int i = 0; i <3; i++) {
            aux=vector[i];
            vector[i]=vector[6-1-i];
            vector[6-1-i]=aux;
        }
        for (int i = 0; i <6 ; i++) {
            System.out.print(vector[i]+" ,");

        }

    }
}
