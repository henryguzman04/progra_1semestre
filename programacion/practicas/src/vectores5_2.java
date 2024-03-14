import java.util.Scanner;

public class vectores5_2 {
    public static void main(String[] args) {
        Scanner he =new Scanner(System.in);
        int  cont=0;
        float va[]=new float[10];
        float su;
        for(int i=0;i <10;i++){
            System.out.println("ingrese el un dato");
        va[i]=he.nextFloat();
        }
        for(int i=0;i <10;i++){
        cont= (int) (cont+va[i]);
        }
        System.out.println("la suma de mis 10 datos es: "+cont);


    }
}
