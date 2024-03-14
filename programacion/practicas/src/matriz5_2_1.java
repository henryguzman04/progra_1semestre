import java.util.Scanner;

public class matriz5_2_1 {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
       int valor [][]=new int[4][4];
       int cont=0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("fila "+i+"  columna "+j);
                valor[i][j]=he.nextInt();

            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (valor[i][j]==0) {
                 cont=cont+1;
                }
            }

        }
        System.out.println("el numero 0 aparece : "+cont+" veces");
    }
}
